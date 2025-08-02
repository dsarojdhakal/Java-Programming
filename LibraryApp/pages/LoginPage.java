package pages;

import pages.ImagePanel;
import db.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public LoginPage() {
        setTitle("Library Management System - Login");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImagePanel mainPanel = new ImagePanel("pages/books.png"); 
        mainPanel.setLayout(new GridBagLayout());

        JPanel formPanel = new JPanel();
        formPanel.setPreferredSize(new Dimension(400, 300));
        formPanel.setBackground(new Color(255, 255, 255, 180)); 
        formPanel.setBorder(BorderFactory.createTitledBorder("Login"));

        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblUsername = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(lblUsername, gbc);

        txtUsername = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(txtUsername, gbc);

        JLabel lblPassword = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(lblPassword, gbc);

        txtPassword = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(txtPassword, gbc);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBackground(new Color(0, 128, 255));
        btnLogin.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        formPanel.add(btnLogin, gbc);

        JButton btnExit = new JButton("Exit");
        btnExit.setBackground(new Color(220, 20, 60));
        btnExit.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        formPanel.add(btnExit, gbc);

        JButton btnSignup = new JButton("Create New Account");
        btnSignup.setBorderPainted(false);
        btnSignup.setContentAreaFilled(false);
        btnSignup.setForeground(new Color(0, 102, 204));
        btnSignup.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        formPanel.add(btnSignup, gbc);

        mainPanel.add(formPanel);

        add(mainPanel);

        btnLogin.addActionListener(e -> login());
        btnExit.addActionListener(e -> System.exit(0));
        btnSignup.addActionListener(e -> {
            this.dispose();
            new SignupPage();
        });

        setVisible(true);
    }

    private void login() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter both username and password.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM AdminLogin WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "✅ Login successful!");
                this.dispose();
                new Dashboard(username);
            } else {
                JOptionPane.showMessageDialog(this, "❌ Invalid credentials.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pst.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "❌ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPage::new);
    }
}
