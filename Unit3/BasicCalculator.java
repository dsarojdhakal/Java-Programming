import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));
        panel.setBounds(50,50,400,200);

        JLabel label1 = new JLabel("Enter first number:");
        JTextField num1Field = new JTextField();
        JLabel label2 = new JLabel("Enter second number:");
        JTextField num2Field = new JTextField();

        JLabel resultLabel = new JLabel("Result: ");

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");

        panel.add(label1);
        panel.add(num1Field);
        panel.add(label2);
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(new JLabel()); // Empty placeholder
        panel.add(resultLabel);

        frame.add(panel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 + num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter integers.");
                } finally {
                    num1Field.setText("");
                    num2Field.setText("");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 - num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter integers.");
                } finally {
                    num1Field.setText("");
                    num2Field.setText("");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 * num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input! Enter integers.");
                } finally {
                    num1Field.setText("");
                    num2Field.setText("");
                }
            }
        });

        frame.setVisible(true);
    }
}
