//WAP to read the ID and Username from users table of BIT4db database using PreparedStatement.


import java.sql.*;

public class RetrieveValueFromDBP {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/BIT4db";
        String user = "root";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            String query = "SELECT id, username FROM users";

            PreparedStatement pstmt = conn.prepareStatement(query);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                System.out.println("ID: " + id + ", Username: " + username);
            }

            rs.close();
            pstmt.close();
            conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
