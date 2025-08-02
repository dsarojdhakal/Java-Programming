import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelProgram {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel Frame");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.RED);
        panel1.setLayout(null);
        panel2.setLayout(null);

        panel1.setBounds(0,0,300,400);
        panel2.setBounds(400,0,200,200);
        frame.setBounds(200,200,800,400);
        frame.add(panel1);

        frame.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
