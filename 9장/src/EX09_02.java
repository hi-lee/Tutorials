import java.awt.*;
import javax.swing.*;

public class EX09_02 extends JApplet implements Runnable {
	int x, y;
	String word;
	Font myFont;
	Thread t1;

	public void run() {
		try {
			while (true) {
				x = x + 5;
				if (x > getWidth())
					x = -150;
				t1.sleep(100);
				repaint();
			}
		} catch (Exception e) {
		}
	}

	public void init() {
		setBackground(Color.white);

		t1 = new Thread(this);
		word = "Java JApplet";
		x = -150;
		y = 50;
		t1.start();
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());

		myFont = new Font("Serif", Font.PLAIN, 30);
		g.setColor(Color.blue);
		g.setFont(myFont);
		g.drawString(word, x, y);
	}

}
