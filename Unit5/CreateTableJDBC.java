import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Lumbinidb";
        String user = "root";
        String password = "";  // empty if no password

        String x = "CREATE TABLE IF NOT EXISTS contacts (" +
                                "id INT PRIMARY KEY, " +
                                "name VARCHAR(100), " +
                                "phone VARCHAR(15)" +
                                ")";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            stmt.executeUpdate(x);
            System.out.println("Table 'contacts' created successfully.");

            stmt.close();
            conn.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
