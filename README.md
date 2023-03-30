###**ShoppingBill**


This project is a simple implementation of a Java application that performs CRUD
(Create, Read, Update, Delete) operations on a database and it help to get billing details of 
a particular products using JDBC. The application provides a command-line interface for interacting
with the database, allowing the user to create, read, update, and delete products in a table and gives 
the billing information including Discount, gst and other charges.


#**Requirements**

To run this project, you will need:

**Languages:**

-Java
-MySQL
-JDBC

**Software:**

-JDK 1.8
-Eclipse IDE
-mysql-connector-java.jar
-MySQL Workbench

#**Usage**

To use the application, follow these steps:

-Clone the repository to your local machine.
-Import the project into your IDE of choice
  Set up a MySQL database and configure the JDBC connection.
-Compile and run the 'MainMethod1.java' file.


Once the application is running, you can interact with the database by calling the methods.
The available methods are:

-inserting : Insert a record in the database.
-updating : Update a record in the database based on a given Product_ID.
-deleting : Delete a record from the database based on a given ID.
-read     : Read all the records from the database.
-getOneProductData : this method will return a record from the database based on a given Product_ID.
-getProductDiscount : this method will return the final billing amount including discount, gst and
                      other charges to be paid of a product record based on a given Product_ID.


#**Database** 
The database used by the application consists of two table, 'products' and 'charges', with the 
following columns:

**products:**
Product_ID (int primary key auto_increment)
Product_Name (varchar)
Product_Type (varchar)
product_Category (varchar)
Product_Price (int)

you can run this table in your MySQL database by running the following SQL scripts:

create table Products(
Product_ID int primary key auto_increment,
Product_Name varchar(50),
Product_Type varchar(50),
product_Category varchar(50),
Product_Price int
);



**charges:**
Product_Category (varchar)
Discount (decimal)
GST (decimal)
Delivery_Charges (int)

you can run this table in your MySQL database by running the following SQL scripts:

create table charges(
Product_Category varchar(50),
Discount decimal(4,2),
GST decimal(4,2),
Delivery_Charges int
);


#**Project Structure**

The project consists of the following packages:

-dao : Contains the classes for interacting with the database and establishing the JDBC connection.
      Contains the main class for viewing the result.

-model : Contains the classes for data objects.



#**Issues and Troubleshooting**

There are currently no known issues with this project. If you
encounter any problems while running the application, please report 
them in the Issues section of the repository.

#**Conclusion**

This project demonstrates a simple implementation of CRUD operations and it help to get billing 
details of a taken product using JDBC in a Java application. By following the steps outlined in the
Usage section, you can easily set up and interact with a MySQL database using this application.

If you have any questions or feedback, please don't hesitate to reach out. 
Thank you for checking out this project!












