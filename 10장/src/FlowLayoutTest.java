import java.awt.*;
import javax.swing.*;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {

		FlowLayout flayout = new FlowLayout();
		setLayout(flayout);

		add(new JButton("첫번째"));
		add(new JButton("두번째"));

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String args[]) {
		FlowLayoutTest flt = new FlowLayoutTest();
		flt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
