import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DisplayRecordsWithButtons extends JFrame {

    private DefaultTableModel model;
    private JTable table;

    public DisplayRecordsWithButtons() {
        setTitle("User Records Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        model = new DefaultTableModel(new String[]{"ID", "Name", "Email"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        JButton btnDisplay = new JButton("Display Data");
        JButton btnDiscard = new JButton("Discard");

        JPanel panel = new JPanel();
        panel.add(btnDisplay);
        panel.add(btnDiscard);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        btnDisplay.addActionListener(e -> displayData());

        btnDiscard.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void displayData() {
        model.setRowCount(0);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                Object[] row = {
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                };
                model.addRow(row);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DisplayRecordsWithButtons());
    }
}
