//WAP to add two records , name and email of two users in a student table of BIT_db database 

import java.sql.*;

public class Insert_2_RecordStatement {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Bit_db";
        String user = "testuser";
        String password = "password";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement stmt = connection.createStatement();

            String query1 = "INSERT INTO student (username, email) VALUES ('Ram Sharma', 'ram@email.com')";
            String query2 = "INSERT INTO student (username, email) VALUES ('Sita Devi', 'sita@email.com')";

            stmt.executeUpdate(query1);
            stmt.executeUpdate(query2);

            connection.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
