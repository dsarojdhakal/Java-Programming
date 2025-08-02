import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            // SQL query to insert a new user
            String sql = "INSERT INTO users (id,name, email) VALUES (1, 'Saroj Dhakal', 'saroj@example.com')";

            Statement stmt = conn.createStatement();
            int rowsInserted = stmt.executeUpdate(sql);

            if (rowsInserted > 0) {
                System.out.println("✅ A new user was inserted successfully!");
            }

            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver class not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("❌ SQL error: " + e.getMessage());
        }
    }
}
