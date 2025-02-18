import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Basic Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10)); // 5 rows, 2 columns, with spacing

        JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField();

        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField();

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");

        frame.add(label1);
        frame.add(textField1);

        frame.add(label2);
        frame.add(textField2);

        frame.add(addButton);
        frame.add(subtractButton);

        frame.add(multiplyButton);
        frame.add(divideButton);

        frame.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    resultLabel.setText("Result: " + (num1 + num2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    resultLabel.setText("Result: " + (num1 - num2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    resultLabel.setText("Result: " + (num1 * num2));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    if (num2 != 0) {
                        resultLabel.setText("Result: " + (num1 / num2));
                    } else {
                        resultLabel.setText("Cannot divide by zero!");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid Input!");
                }
            }
        });

        frame.setVisible(true);
    }
}
