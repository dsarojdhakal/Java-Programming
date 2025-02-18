//WAP to Update username and email of students(Student table) stored in the database BIT_db using PreparedStatement(Dynamic SQL query)


import java.sql.*;

public class UpdateTableDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Bit_db";
        String user = "testuser";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String query = "UPDATE users SET username = ?, email = ? WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, "new_username");
            pstmt.setString(2, "new_email@example.com");
            pstmt.setInt(3, 5);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row updated.");
        } 
        catch (Exception e) {
            e.toString();
        }
    }
}
