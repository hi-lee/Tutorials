import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class JFrameEx extends JFrame {
	int x[] = { 50, 100, 150, 200 };
	int y[] = { 50, 100, 150, 200 };

	JFrameEx() {
		super("JFrame");	//제목표시줄
		setSize(300, 300);
		setLocation(300, 300);
		setVisible(true);	//반드시 들어가야함
	}

	public void paint(Graphics g) {
		int j = 0;
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(0, 0);
		for (int i = 0; i < 4; i++) {
			g2d.setPaint(new GradientPaint(5, 30, Color.red, 10 + j, 50 + j, Color.blue, true));
			g2d.fill(new Ellipse2D.Double(x[i], y[i], 70, 50));
			j += 5;
		}
	}

	public static void main(String args[]) {
		JFrameEx jfe = new JFrameEx();	//메인메소드에서 객체생성
		jfe.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		jfe.setVisible(true); 도 가능
	}

}
