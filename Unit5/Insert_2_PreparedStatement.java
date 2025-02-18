//This program demonstrates how to insert two records (username and email) into the "student" table in a MySQL database using PreparedStatement.
 
import java.sql.*;

public class Insert_2_PreparedStatement {
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
            pstmt.executeUpdate();

            pstmt.setString(1, "Sita Devi");
            pstmt.setString(2, "sita@email.com");
            pstmt.executeUpdate();

            connection.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
