
import java.applet.Applet;
import java.awt.Graphics;

public class AppletExample extends Applet 
{
	// Overriding paint() method
	@Override
	public void paint(Graphics g) 
	{
		g.drawString("Hello World", 20, 20);
	}
	
}
