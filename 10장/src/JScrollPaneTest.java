import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
	JPanel jp;

	JScrollPaneTest() {
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(10, 5)); //50개 컴포넌트 추가, GridLayout 객체안에
		int cnt = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 5; j++) {
				jp.add(new JButton("버튼" + cnt)); 	//50개 버튼 생성, 순서대로 들어감
				cnt++;
			}
		}
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v, h);
		add(js, BorderLayout.CENTER);
//		패널이 스크롤에 붙고 붙은 스크롤을 패널에 add시킴

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JScrollPaneTest();
	}
}
