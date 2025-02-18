//WAP to Add/Insert Username and Email in the Student table of BIT_db database.
import java.sql.*;

public class InsertUsingStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Bit_db";
        String user = "testuser";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String username = "RamSharma";
            String email = "ram@email.com";

            String query = "INSERT INTO Student (username, email) VALUES ('" + username + "', '" + email + "')";
            Statement stmt = connection.createStatement();

            stmt.executeUpdate(query);
            connection.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
