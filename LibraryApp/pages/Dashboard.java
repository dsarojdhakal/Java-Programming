package pages;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    private String username;

    public Dashboard(String username) {
        this.username = username;

        setTitle("Library Management System - Dashboard");
        setExtendedState(JFrame.MAXIMIZED_BOTH); // fullscreen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top panel with title and welcome message
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(30, 144, 255));
        topPanel.setPreferredSize(new Dimension(0, 80));

        JLabel titleLabel = new JLabel("  Library Management System - Dashboard");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
        topPanel.add(titleLabel, BorderLayout.WEST);

        JLabel welcomeLabel = new JLabel("Welcome, " + username + "  ");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        topPanel.add(welcomeLabel, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);

        // Center panel with buttons
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setLayout(new GridLayout(2, 3, 20, 20));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(40, 100, 40, 100));

        String[] buttons = {
            "📚 Manage Books",
            "📖 Issue Books",
            "🔁 Return Books",
            "🎓 View Students",
            "📊 Reports",
            "🚪 Logout"
        };

        for (String btnText : buttons) {
            JButton btn = new JButton(btnText);
            btn.setFont(new Font("Arial", Font.BOLD, 16));
            btn.setFocusPainted(false);
            btn.setBackground(new Color(240, 248, 255));
            btn.setBorder(BorderFactory.createLineBorder(new Color(0, 120, 215), 2));

            if (btnText.contains("Logout")) {
                btn.setBackground(new Color(255, 99, 71));
                btn.setForeground(Color.WHITE);
                btn.addActionListener(e -> logout());
            } else {
                btn.addActionListener(e -> JOptionPane.showMessageDialog(this, btnText + " page coming soon..."));
            }
            centerPanel.add(btn);
        }

        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void logout() {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            this.dispose();
            new LoginPage();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashboard("admin"));
    }
}
