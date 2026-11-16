
package services;

import config.dbconfig;
import entity.invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class invoiceservice {

    public void addinvoice(invoice invoice) throws SQLException {

        String sql = "INSERT INTO invoices(customer_id, vechile_id, service_id) VALUES (?, ?, ?)";

        try (Connection con = dbconfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, invoice.getcustomer_id());
            ps.setInt(2, invoice.getvechile_id());
            ps.setInt(3, invoice.getservice_id());

            ps.executeUpdate();
        }
    }

    public List<invoice> getallinvoices() throws SQLException {

        List<invoice> list = new ArrayList<>();

        String sql = "SELECT * FROM invoices";

        try (Connection con = dbconfig.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                list.add(new invoice(
                        rs.getInt("id"),
                        rs.getInt("customer_id"),
                        rs.getInt("vechile_id"),
                        rs.getInt("service_id")
                ));
            }
        }

        return list;
    }
}
