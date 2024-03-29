import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseEventDrawFrame extends JFrame implements MouseListener {
	int noval = 0;
	int[] x, y;

	public MouseEventDrawFrame() {
		// TODO Auto-generated constructor stub
		x = new int[50];
		y = new int[50];
		addMouseListener(this);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString("마우스를 클릭하면 사각형을 그림", 10, 10);
		g.setColor(Color.red);
		for (int i = 0; i < noval; i++) {
			g.drawRect(x[i] - 20, y[i] - 20, 50, 50);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (noval < 50) {
			x[noval] = e.getX();
			y[noval] = e.getY();
			noval++;
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String [] args) {
		new MouseEventDrawFrame();	
	}
}
