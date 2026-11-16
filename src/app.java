import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
import services.customerservices;
import services.vehicleservices;

import entity.customer;
import services.billingservice;

public class app {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        billingservice service=new billingservice();
        vehicleservices vs = new vehicleservices();
        while (true){
            System.out.println(
                    "1. Add customer\n" +
                            "2. Generate invoices\n" +
                            "3. Show invoice\n" +
                            "4. Add vehicle\n" +
                            "5. Exit"
            );
           int ch=sc.nextInt();
           switch (ch){
               case 1:
                   System.out.println("customer name: ");
                   String name=sc.next();
                   System.out.println("phone: ");
                   String phone= sc.next();
                   service.customerservices.addcustomer(new customer(0,name,phone));
                   break;


               case 2:
                   System.out.println("enter customer id: ");
                   int cid= sc.nextInt();
                   System.out.println("enter vechile id: ");
                   int vid= sc.nextInt();
                   System.out.println("enter no of services: ");
                   int n= sc.nextInt();
                   List<Integer>sids= new ArrayList<>();
                   for (int i=0;i<n;i++){
                       System.out.println("enter the service id:");
                       sids.add(sc.nextInt());
                   }
                   service.createinvoice(cid,vid,sids);
                   break;
               case 3:
                   service.showallinvoices();
                   break;
               case 4:
                   System.out.println("Enter customer id:");
                   int customerId = sc.nextInt();

                   System.out.println("Enter vehicle number plate:");
                   String numberPlate = sc.next();

                   System.out.println("Enter vehicle model:");
                   String model = sc.next();

                   vs.addvehicle(customerId, numberPlate, model);

                   System.out.println("Vehicle added successfully!");
                   break;

               case 5:
                   sc.close();
                   System.exit(0);
                   break;

               default:
                   System.out.println("invalid chice");
                   break;

           }
        }


    }
}
