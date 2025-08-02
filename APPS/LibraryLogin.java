import javax.swing.*;
import java.awt.*;

public class LibraryLogin extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public LibraryLogin() {
        setTitle("Library Management System - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 248, 255)); // Light blue background

        JLabel lblTitle = new JLabel("Library Login");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitle.setBounds(130, 20, 200, 30);
        panel.add(lblTitle);

        // Username Label
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(50, 80, 80, 25);
        panel.add(lblUsername);

        // Username Text Field
        txtUsername = new JTextField();
        txtUsername.setBounds(140, 80, 180, 25);
        panel.add(txtUsername);

        // Password Label
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 120, 80, 25);
        panel.add(lblPassword);

        // Password Field
        txtPassword = new JPasswordField();
        txtPassword.setBounds(140, 120, 180, 25);
        panel.add(txtPassword);

        // Login Button
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(90, 180, 100, 30);
        btnLogin.setBackground(new Color(0, 128, 255));
        btnLogin.setForeground(Color.WHITE);
        panel.add(btnLogin);

        // Exit Button
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(210, 180, 100, 30);
        btnExit.setBackground(new Color(220, 20, 60));
        btnExit.setForeground(Color.WHITE);
        panel.add(btnExit);

        // Button Actions
        btnLogin.addActionListener(e -> login());
        btnExit.addActionListener(e -> System.exit(0));

        add(panel);
        setVisible(true);
    }

    private void login() {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());

        if (username.equals("admin") && password.equals("admin123")) {
            JOptionPane.showMessageDialog(this, "✅ Login Successful!");
            // You can open dashboard from here
        } else {
            JOptionPane.showMessageDialog(this, "❌ Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryLogin());
    }
}
