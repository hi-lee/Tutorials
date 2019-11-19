import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest extends JFrame {
	public BorderLayoutTest() {
		super("보더 레이아웃");
		add("North", new Button("Notrth"));
		add(BorderLayout.EAST, new Button("East"));
		add(new Button("Center"), BorderLayout.CENTER);
		add(new Button("Souteh"), BorderLayout.SOUTH);
		add(new Button("West"), BorderLayout.WEST);
//		컴포턴트, 위치 순서 상관 없음
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		BorderLayoutTest blt = new BorderLayoutTest();
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
