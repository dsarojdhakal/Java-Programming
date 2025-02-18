import javax.swing.*;
import java.awt.event.*;

public class KeyEventDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Key Event Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Press any key...");
        label.setBounds(100, 100, 200, 30);
        frame.add(label);

        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + e.getKeyChar());
            }

            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }
        });

        frame.setFocusable(true);
        frame.setVisible(true);
    }
}
