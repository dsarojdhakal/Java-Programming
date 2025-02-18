import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class program4 extends JFrame implements MouseListener, MouseMotionListener {

    JLabel label;

    public program4() {
        setTitle("Mouse Event Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Perform mouse actions");
        label.setPreferredSize(new Dimension(350, 30));
        add(label);

        addMouseListener(this);
        addMouseMotionListener(this);

        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered the frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited the frame");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse dragged at: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse moved at: (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        new program4();
    }
}
