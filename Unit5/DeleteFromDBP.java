//WAP to delete the records of Students from "Student" table where id is 5 using statement.

import java.sql.*;

public class DeleteFromDBP {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/LADCdb";
        String user = "testuser";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {

            Statement stmt = connection.createStatement();

            int idToDelete = 5;
            String query = "DELETE FROM users WHERE id = " + idToDelete;

            int rowsAffected = stmt.executeUpdate(query);
            System.out.println(rowsAffected + " row deleted.");
        } 

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
