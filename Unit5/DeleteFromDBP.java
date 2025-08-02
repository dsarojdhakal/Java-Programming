import java.sql.*;

public class DeleteFromDBP {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Lumbinidb";
        String user = "root";  
        String password = "";  

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement stmt = connection.createStatement();

            int idToDelete = 5;
            String query = "DELETE FROM contacts WHERE id = " + idToDelete;

            int rowsAffected = stmt.executeUpdate(query);
            System.out.println(rowsAffected + " row(s) deleted.");
            System.out.println("Database connected sucessfully...."); 
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
