//WAP to delete the records of Students from "Student" table where id is 5 using PreparedStatement.

import java.sql.*;

public class DeleteFromDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/LADCdb";
        String user = "testuser";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "DELETE FROM Student WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, 5);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row deleted.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
