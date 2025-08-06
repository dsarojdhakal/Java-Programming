import javax.swing.*;

public class TextFieldDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null); 

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 20);
        // JTextField nameField = new JTextField();
        // nameField.setBounds(110, 20, 150, 25);

        // JLabel passwordLabel = new JLabel("Password:");
        // passwordLabel.setBounds(20, 60, 80, 25);
        // JPasswordField passwordField = new JPasswordField();
        // passwordField.setBounds(110, 60, 150, 25);

        frame.add(nameLabel);
        // frame.add(nameField);
        // frame.add(passwordLabel);
        // frame.add(passwordField);

        frame.setVisible(true);
    }
} 