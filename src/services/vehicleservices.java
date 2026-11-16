package services;

import config.dbconfig;
import java.sql.*;

public class vehicleservices {

    public void addvehicle(int customerId, String numberPlate, String model)
            throws SQLException {

        String checkSql = "SELECT id FROM customers WHERE id = ?";
        String insertSql = "INSERT INTO vechiles(customer_id, number_plate, model) VALUES (?, ?, ?)";

        try (Connection con = dbconfig.getConnection()) {

            // Step 1: Check customer exists
            try (PreparedStatement checkPs = con.prepareStatement(checkSql)) {

                checkPs.setInt(1, customerId);

                try (ResultSet rs = checkPs.executeQuery()) {

                    if (!rs.next()) {
                        System.out.println("Customer not found! Please enter a valid customer ID.");
                        return;
                    }
                }
            }

            // Step 2: Insert vehicle
            try (PreparedStatement ps = con.prepareStatement(insertSql)) {

                ps.setInt(1, customerId);
                ps.setString(2, numberPlate);
                ps.setString(3, model);

                ps.executeUpdate();

                System.out.println("Vehicle added successfully!");
            }
        }
    }
}