import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NullContainer2 extends JFrame implements ActionListener {
	JPanel panel;
	Card cards;

	public NullContainer2() {
		setTitle(" CardLayout ");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0)); // 행0: 행개수지정X, 열이 5개 넘어가면 다음줄로 넘어감, 간격10
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);

		add(panel, "North");
		cards = new Card();
		add(cards, "Center");
		setVisible(true);
	}

	void addButton(String str, Container target) { // 들어갈글자, target에 add시킴
		JButton button = new JButton(str);
		button.addActionListener(this); // 버튼이 눌리면 action 취함, this: 클래스 전체 ->클래스 동작을 감지
		target.add(button);
	}

	private class Card extends JPanel {
		CardLayout layout;

		public Card() {
			layout = new CardLayout();
			setLayout(layout);
			for (int i = 1; i <= 10; i++)
				add(new JButton("현재 카드의 번호-> " + i), "Center"); // 10개의 카드를 만들고 버튼생성(카드형식으로 버튼추가)
		}
	}

	public void actionPerformed(ActionEvent e) {
//		if (e.getActionCommand().endsWith("종료"))
		if (e.getActionCommand().equals("종료"))
			System.exit(0);
		if (e.getActionCommand().equals("<<"))
			cards.layout.first(cards);
		if (e.getActionCommand().equals("<"))
			cards.layout.previous(cards);
		if (e.getActionCommand().equals(">"))
			cards.layout.next(cards);
		if (e.getActionCommand().equals(">>"))
			cards.layout.last(cards);
	}

	public static void main(String[] args) {
		NullContainer2 uc = new NullContainer2();
	}

}
