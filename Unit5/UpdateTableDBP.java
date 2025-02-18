//WAP to Update username and email of students(Student table) stored in the database BIT_db using Statement(Static SQL query)

import java.sql.*;

public class UpdateTableDBP {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Bit_db";
        String user = "testuser";
        String password = "password";

        try  {

            Connection connection = DriverManager.getConnection(url, user, password);
            String newUsername = "new_username";
            String newEmail = "new_email@example.com";
            int idToUpdate = 5;


            String query = "UPDATE Student SET username = '" + newUsername + 
                           "', email = '" + newEmail + 
                           "' WHERE id = " + idToUpdate;

            Statement stmt = connection.createStatement();

            stmt.executeUpdate(query);
            connection.close();
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
