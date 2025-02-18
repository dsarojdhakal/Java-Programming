//WAP to Add/Insert Username and Email in the Student table of BIT_db database using Prepared statement

import java.sql.*;

public class InsertUsingPreparedSt {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Bit_db";
        String user = "testuser";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO student (username, email) VALUES (?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, "Ram Sharma");
            pstmt.setString(2, "ram@email.com");

            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
            connection.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
