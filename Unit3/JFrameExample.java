import javax.swing.JFrame;

public class JFrameExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My first frame");
        frame.setLayout(null);
        frame.setBounds(100,100,400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}