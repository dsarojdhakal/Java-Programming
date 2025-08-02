import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet {

    public void init() {
        System.out.println("Applet initialized");
    }

    public void paint(Graphics g) {
        g.drawString("Hello, Applet!", 50, 50); 
    }
}
