//WAP to read the ID and Username from users table of BITdb database using Statement.

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.Statement;

import java.sql.*;


public class RetrieveValueFromDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/BIT4db";
        String user = "root";
        String password = "password";

        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            Statement stmt = conn.createStatement();

            String query = "SELECT id, username FROM users";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                System.out.println("ID: " + id + ", Username: " + username);
            }

            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
