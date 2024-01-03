// Import necessary classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Define the main class
public class Demo {
 // Main method
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
     // Specify the JDBC driver class
     String driver = "com.mysql.jdbc.Driver";

     // Specify the database URL, username, and password
     String url = "jdbc:mysql://localhost:3306/internship";
     String user = "root";
     String pass = "tsaj12345";

     // Define the SQL statement to insert a record into the 'internship' table
     String insert = "INSERT INTO internship (id, name, duration) VALUES (11,'something', 1);";

     // Load the JDBC driver
     Class.forName(driver);

     // Establish a connection to the database
     Connection conn = DriverManager.getConnection(url, user, pass);
     System.out.println("Connection to Data Established Successfully on Port 3306 !!");

     // Create a Statement object
     Statement state = conn.createStatement();
     
     // Execute the SQL statement and store the number of affected rows
     int rowsAffected = state.executeUpdate(insert);

     // Check if the record was inserted successfully
     if (rowsAffected > 0) {
         System.out.println("Record inserted successfully.");
     } else {
         System.out.println("Failed to insert record.");
     }

     // Close the Statement and Connection objects
     state.close();
     conn.close();
 }
}
s