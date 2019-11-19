import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex11_01 extends JFrame implements ActionListener, ItemListener {
	JCheckBox c1, c2, c3;
	JTextField tf, tf1;
	JButton bt;
	String str = new String();
	String str1 = new String();

	public Ex11_01() {
		// TODO Auto-generated constructor stub
		super("체크박스 버튼 만들기");
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.add(c1 = new JCheckBox("음악감상"));
		p1.add(c2 = new JCheckBox("등산"));
		p1.add(c3 = new JCheckBox("조깅"));
		JPanel p2 = new JPanel();
		p2.add(tf = new JTextField(10));
		p2.add(tf1 = new JTextField(10));
		JPanel p3 = new JPanel();
		p3.add(bt = new JButton("확인"));
		JPanel p4 = new JPanel();
		p4.add(p2, "North");
		p4.add(p3, "Center");

		add(p1, "North");
		add(p4, "Center");

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		bt.addActionListener(this);
	}

	public static void main(String[] args) {
		new Ex11_01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == bt) {
			if (c1.isSelected()) {
				str1 += "음악감상 ";
			}
			if (c2.isSelected()) {
				str1 += "등산 ";
			}
			if (c3.isSelected()) {
				str1 += "조깅";
			}
		}
		tf1.setText(str1);
//		선택된 상태에서 보기때문에 [조깅-등산] -> 확인 -> [등산-조깅] 본순서대로 나옴
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == c1) {
			if (e.getStateChange() == ItemEvent.SELECTED)
				str += "음악감상 ";
			else
				str = str.replace("음악감상 ", " ");
		}
		if (e.getSource() == c2) {
			if (e.getStateChange() == ItemEvent.SELECTED)
				str += "등산 ";
			else
				str = str.replace("등산 ", " ");
		}
		if (e.getSource() == c3) {
			if (e.getStateChange() == ItemEvent.SELECTED)
				str += "조깅 ";
			else
				str = str.replace("조깅 ", " ");
		}

		if (str.isEmpty())
			tf.setText(" ");
		else
			tf.setText(str);
	}
}
