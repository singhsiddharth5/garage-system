
package services;

import entity.customer;
import config.dbconfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class customerservices {

    public void addcustomer(customer customer) throws SQLException {

        String sql = "INSERT INTO customers(name, phone) VALUES (?, ?)";

        try (Connection con = dbconfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, customer.getName());
            ps.setString(2, customer.getPhone());

            ps.executeUpdate();
        }
    }

    public List<customer> getallcustomers() throws SQLException {

        List<customer> list = new ArrayList<>();

        String sql = "SELECT * FROM customers";

        try (Connection con = dbconfig.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                list.add(new customer(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone")
                ));
            }
        }

        return list;
    }
}
