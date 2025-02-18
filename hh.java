import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class hh {
    private static final String FILE_PATH = "credentials.txt";
    
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(4, 2));
        
        JLabel labelId = new JLabel("ID:");
        JTextField textId = new JTextField();
        JLabel labelPassword = new JLabel("Password:");
        JPasswordField textPassword = new JPasswordField();
        JButton buttonLogin = new JButton("Login");
        JButton buttonRegister = new JButton("Register");
        JLabel messageLabel = new JLabel("");

        frame.add(labelId);
        frame.add(textId);
        frame.add(labelPassword);
        frame.add(textPassword);
        frame.add(buttonLogin);
        frame.add(buttonRegister);
        frame.add(messageLabel);
        
        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredId = textId.getText();
                String enteredPassword = new String(textPassword.getPassword());
                if (login(enteredId, enteredPassword)) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Sorry, login failed.");
                }
            }
        });

        buttonRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String newId = textId.getText();
                String newPassword = new String(textPassword.getPassword());
                if (register(newId, newPassword)) {
                    messageLabel.setText("Registration successful!");
                } else {
                    messageLabel.setText("Registration failed. ID may already exist.");
                }
            }
        });

        frame.setVisible(true);
    }

    private static boolean register(String id, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            // Check if ID already exists
            if (checkIdExists(id)) {
                return false;
            }
            writer.write(id + "," + password);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean checkIdExists(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials.length == 2 && credentials[0].equals(id)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; 
    }

    private static boolean login(String enteredId, String enteredPassword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials.length == 2 && credentials[0].equals(enteredId) && credentials[1].equals(enteredPassword)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; 
    }
}
