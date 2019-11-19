import javax.swing.*;
import java.awt.*;

public class PolylineJApplet extends JApplet {
	public void init() {
		setBackground(Color.yellow);
	}

	public void paint(Graphics g) {
		int[] x1 = { 50, 25, 60, 90, 55 };
		int[] y1 = { 50, 70, 95, 40, 30 };

		int[] x2 = { 130, 105, 140, 170, 135 };
		int[] y2 = { 50, 70, 95, 40, 30 };

		g.setColor(Color.blue);
		g.drawPolyline(x1, y1, 5);
		g.drawPolygon(x2, y2, 5);
	}
}
