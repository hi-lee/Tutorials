import javax.swing.*;
import java.awt.*;

public class EX09_01 extends JApplet{
	public void init() {
		setSize(400,300);
	}
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(50, 50, 100, 100);
		g.setColor(Color.orange);
		g.fillOval(75, 77, 50, 50);
		g.setColor(Color.green);
		g.fillRect(95, 150, 10, 40);
		g.setColor(Color.green);
		g.fillArc(65, 155, 35, 35, 120, 180);
		g.setColor(Color.green);
		g.fillArc(100, 155, 35, 35, 240, 180);
	}
}
