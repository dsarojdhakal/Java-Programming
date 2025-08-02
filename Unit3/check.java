import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class check {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setLayout(null);

        JLabel labelUsername = new JLabel("Username :");
        JLabel labelPassword = new JLabel("Password :");

        JTextField fieldUsername = new JTextField();
        JPasswordField fieldPassword = new JPasswordField();
        JLabel displayMessage = new JLabel();
        JButton loginBtn = new JButton("Log In");

        labelUsername.setBounds(20, 20, 100, 30);
        labelPassword.setBounds(20, 60, 100, 30);
        fieldUsername.setBounds(140, 20, 100, 30);
        fieldPassword.setBounds(140, 60, 100, 30);
        loginBtn.setBounds(150, 150, 80, 30);
        displayMessage.setBounds(40, 110, 300, 30);

        ActionListener loginAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = fieldUsername.getText();
                String password = new String(fieldPassword.getPassword());
                if (password.isEmpty() || username.isEmpty()) {
                    displayMessage.setText("Please try again");
                } else {
                    displayMessage.setText("Username : " + username + " and Password : " + password);
                }
            }
        };

        loginBtn.addActionListener(loginAction);

        fieldUsername.addActionListener(loginAction);
        fieldPassword.addActionListener(loginAction);

        frame.add(labelUsername);
        frame.add(labelPassword);
        frame.add(fieldUsername);
        frame.add(fieldPassword);
        frame.add(loginBtn);
        frame.add(displayMessage);

        frame.setBounds(100, 100, 450, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}