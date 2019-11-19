import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDraw extends JApplet implements MouseListener {
	int noval = 0;
	int[] x, y;
	
	public void init() {
		x = new int[50];
		y = new int[50];
		addMouseListener(this);
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString("���콺�� Ŭ���ϸ� �簢���� �׸�", 10, 10);
		g.setColor(Color.red);
		for (int i=0; i<noval; i++) {
			g.drawRect(x[i]-20, y[i]-20, 50, 50);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(noval<50) {
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

}
