# Garage Management System

## About the Project
The Garage Management System is a Java-based application designed to manage garage operations such as customer registration, vehicle management, and invoice generation.

## Features
- Add new customers
- Register customer vehicles
- Generate invoices
- View all invoices
- Store data in a MySQL database

## Technologies Used
- Java
- JDBC
- MySQL
- IntelliJ IDEA

## Database
Database Name: `garage`

Main tables:
- `customers`
- `vechiles`
- `services`
- `invoices`

## Project Structure
```text
garage system/
└── src/
    ├── app.java
    ├── config/
    │   └── dbconfig.java
    ├── entity/
    │   ├── customer.java
    │   └── invoice.java
    └── services/
        ├── billingservice.java
        ├── customerservices.java
        ├── invoiceservice.java
        └── vehicleservices.java
```

## How to Run
1. Open the project in IntelliJ IDEA.
2. Configure MySQL and create the `garage` database.
3. Add the MySQL JDBC Connector to the project.
4. Update database connection settings.
5. Run `app.java`.

## Author
Siddharth Singh
