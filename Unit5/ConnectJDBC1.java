import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectJDBC1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Lumbinidb";
        String user = "root";
        String password = "";  // empty password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Optional for JDBC 4.0+

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
