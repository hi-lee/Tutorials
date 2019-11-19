import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JFrame implements ActionListener {
	JTextField tf1, tf2, tf3;
	JTextArea ta;
	JButton bt1, bt2;

	Board() {
		setLayout(new FlowLayout());

		JLabel lb1 = new JLabel("글제목");
		JLabel lb2 = new JLabel("작성일");
		JLabel lb3 = new JLabel("작성자");
		JLabel lb4 = new JLabel("내용");

		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		ta = new JTextArea(10, 30);

		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(lb3);
		add(tf3);
		add(lb4);
		add(ta);

		bt1 = new JButton("글등록");
		add(bt1);
		bt2 = new JButton("다시쓰기");
		add(bt2);

		setSize(300, 400);
		setVisible(true);

		bt1.addActionListener(this);
		bt2.addActionListener(this);

	}

	public static void main(String[] args) {
		new Board();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = " ";
		if (e.getSource() == bt1) {
			str ="글제목 : " + tf1.getText() + "\n" + "작성일 : " + tf2.getText() + "\n" +
					"작성자 : " + tf3.getText() + "\n" + ta.getText();		
			JOptionPane.showMessageDialog(this, str);
		}
		if (e.getSource() == bt2) {
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
			ta.setText(" ");					
		}
	}
}
