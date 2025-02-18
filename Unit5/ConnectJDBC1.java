//WAP to connect JDBC to the database.

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectJDBC1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Lumbinidb";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
