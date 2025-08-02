import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DisplayRecordGUI extends JFrame {

    public DisplayRecordGUI() {
        setTitle("User Records");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Table model with column headers
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Email");

        // Fetch data from MySQL and add to model
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                model.addRow(new Object[]{id, name, email});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }

        // Create table and scroll pane
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Add to frame
        add(scrollPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new DisplayRecordGUI());
    }
}
