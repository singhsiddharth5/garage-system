package services;

import entity.invoice;

import java.sql.SQLException;
import java.util.List;

public class billingservice {
    public customerservices customerservices=new  customerservices();
    public invoiceservice invoiceservice=new invoiceservice();
    public void createinvoice(int customer_id, int vechile_id, List<Integer>service_id) throws SQLException{
        for ( int serviceid:service_id){
            invoiceservice.addinvoice(new invoice(0,customer_id,vechile_id,serviceid));
        }
        System.out.println("invoice generated sucessfully..");


    }
    public void showallinvoices() throws SQLException {

        List<invoice> invoices = invoiceservice.getallinvoices();

        if (invoices.isEmpty()) {
            System.out.println("No invoices found!");
            return;
        }

        for (invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

}
