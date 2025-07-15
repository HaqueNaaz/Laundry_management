package landryshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

    public static Connection connectionDB() {
        try {
            // Load the JDBC driver (not always required in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/laundry";
            String user = "root";
            String password = ""; // your password if any
            Connection connect = DriverManager.getConnection(url, user, password);
            return connect;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
