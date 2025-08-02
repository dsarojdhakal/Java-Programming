package pages;

import pages.ImagePanel;
import db.DBConnection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class SignupPage extends JFrame {

    private JTextField txtFullname, txtUsername, txtEmail, txtPhone;
    private JPasswordField txtPassword;
    private JButton btnSignup, btnClear, btnLogin;

    public SignupPage() {
        setTitle("Library Management System - Signup");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ImagePanel mainPanel = new ImagePanel("pages/books.png");
        mainPanel.setLayout(new GridBagLayout());

        JPanel formPanel = new JPanel();
        formPanel.setPreferredSize(new Dimension(450, 420));
        formPanel.setBackground(new Color(255, 255, 255, 180));
        formPanel.setBorder(BorderFactory.createTitledBorder("Signup"));

        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblFullname = new JLabel("Full Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(lblFullname, gbc);

        txtFullname = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(txtFullname, gbc);

        JLabel lblUsername = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(lblUsername, gbc);

        txtUsername = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(txtUsername, gbc);

        JLabel lblEmail = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(lblEmail, gbc);

        txtEmail = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(txtEmail, gbc);

        JLabel lblPhone = new JLabel("Phone:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(lblPhone, gbc);

        txtPhone = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        formPanel.add(txtPhone, gbc);

        JLabel lblPassword = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(lblPassword, gbc);

        txtPassword = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 4;
        formPanel.add(txtPassword, gbc);

        btnSignup = new JButton("Sign Up");
        btnSignup.setBackground(new Color(0, 128, 255));
        btnSignup.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        formPanel.add(btnSignup, gbc);

        btnClear = new JButton("Clear");
        btnClear.setBackground(new Color(220, 20, 60));
        btnClear.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        formPanel.add(btnClear, gbc);

        btnLogin = new JButton("Already have an account? Login here");
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setForeground(new Color(0, 102, 204));
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        formPanel.add(btnLogin, gbc);

        mainPanel.add(formPanel);

        add(mainPanel);

        btnSignup.addActionListener(e -> signup());
        btnClear.addActionListener(e -> clearFields());
        btnLogin.addActionListener(e -> {
            this.dispose();
            new LoginPage();
        });

        setVisible(true);
    }

    private void signup() {
        String fullname = txtFullname.getText().trim();
        String username = txtUsername.getText().trim();
        String email = txtEmail.getText().trim();
        String phone = txtPhone.getText().trim();
        String password = new String(txtPassword.getPassword()).trim();

        if (fullname.isEmpty() || username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO AdminLogin (username, fullname, email, phone, password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, username);
            pst.setString(2, fullname);
            pst.setString(3, email);
            pst.setString(4, phone);
            pst.setString(5, password);

            int inserted = pst.executeUpdate();
            if (inserted > 0) {
                JOptionPane.showMessageDialog(this, "✅ Signup successful! You can now login.");
                clearFields();
                this.dispose();
                new LoginPage();
            } else {
                JOptionPane.showMessageDialog(this, "❌ Signup failed. Try again.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "❌ Error: " + ex.getMessage());
        }
    }

    private void clearFields() {
        txtFullname.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtPassword.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SignupPage::new);
    }
}
