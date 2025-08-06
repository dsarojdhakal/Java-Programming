import javax.swing.JFrame;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setLayout(null);
        frame.setBounds(100,100,900,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}