import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class JButtonBasic {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BTN Page");
        frame.setLayout(null);
    
        JButton loginBtn = new JButton("Log In");
        loginBtn.setBounds(150,150, 80,30);

        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
            }
        });

        frame.add(loginBtn);
        frame.setBounds(100,100,450,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
} 
