import javax.swing.JApplet;
import java.awt.*;
public class ParamJApplet extends JApplet {
	String title;
	public void init() {
		title = getParameter("param1");
		if(title==null)
			title = "���޹��� �μ��� ����.";
	}
	public void paint(Graphics g) {
		g.drawString(title, 100, 100);
	}
}
