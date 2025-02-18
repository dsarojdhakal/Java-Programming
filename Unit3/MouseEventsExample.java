import javax.swing.*;
import java.awt.event.*;

public class MouseEventsExample  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setBounds(0, 0, 400,400);
        frame.setLayout(null);
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setBounds(100,100,200,30);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e){
                label.setText("Mouse Clicked");
            }

            public void mousePressed(MouseEvent e){
                label.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e){
                label.setText("Mouse Released");
            }

            public void mouseEntered(MouseEvent e){
                label.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e){
                label.setText("Mouse Exited");
            }
        });

        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e){
                label.setText("Mouse Dragged");
            }
            public void mouseMoved(MouseEvent e){
                label.setText("Mouse Moved");
            }

        });
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
