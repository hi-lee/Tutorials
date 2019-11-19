import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
	JPanel jp;

	JScrollPaneTest() {
		setLayout(new BorderLayout());
		jp = new JPanel();
		jp.setLayout(new GridLayout(10, 5)); //50�� ������Ʈ �߰�, GridLayout ��ü�ȿ�
		int cnt = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 5; j++) {
				jp.add(new JButton("��ư" + cnt)); 	//50�� ��ư ����, ������� ��
				cnt++;
			}
		}
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js = new JScrollPane(jp, v, h);
		add(js, BorderLayout.CENTER);
//		�г��� ��ũ�ѿ� �ٰ� ���� ��ũ���� �гο� add��Ŵ

		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JScrollPaneTest();
	}
}
