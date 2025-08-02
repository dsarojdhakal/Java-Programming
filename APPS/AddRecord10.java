import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddRecord10 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            for (int i = 2; i <= 11; i++) {
                String name = "User" + i;
                String email = "user" + i + "@example.com";
                String sql = "INSERT INTO users (id, name, email) VALUES (" + i + ", '" + name + "', '" + email + "')";
                stmt.executeUpdate(sql);
            }

            System.out.println("✅ 10 records inserted successfully!");

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver class not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ SQL error: " + e.getMessage());
        }
    }
}
