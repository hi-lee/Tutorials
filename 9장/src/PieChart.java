
//Ex09_01
import javax.swing.*;
import java.awt.*;

public class PieChart extends JApplet {
	int[] input = { 30, 15, 45, 10 };
	String[] title = { "��", "��", "��", "������" };
	Color[] color = { Color.red, Color.orange, Color.blue, Color.gray };

	public void init() {
		setBackground(Color.LIGHT_GRAY);
		setSize(350, 250);
	}

	public void paint(Graphics g) {
		int startAngle = 0;
		int pieSize;
		int subtot = 0;

		for (int i = 0; i < input.length; i++) {
//			���� �׸��� �κ�
			pieSize = 360 * input[i] / 100;
//			startAngle += subtot;
			g.setColor(color[i]);
			g.fillArc(0, 0, 200, 200, startAngle, pieSize);
//			subtot = pieSize;
			startAngle += pieSize;

//			���� �׸��� �κ�
			subtot = 20 + (i * 20);
			g.setColor(color[i]);
			g.fillRect(250, subtot, 10, 10);
			g.drawString(title[i], 265, subtot+10);

		}
	}

}
