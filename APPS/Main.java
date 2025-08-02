import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL to add a new column 'email' to the 'users' table
            String sql = "ALTER TABLE users ADD COLUMN email VARCHAR(100)";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            System.out.println("✅ Column 'email' added successfully!");

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver class not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ SQL error: " + e.getMessage());
        }
    }
}
