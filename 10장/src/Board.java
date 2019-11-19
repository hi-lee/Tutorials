import java.awt.*;
import javax.swing.*;

public class Board extends JFrame {
	JTextField tf1, tf2, tf3;
	JTextArea ta;
	JButton bt1, bt2;
	
	Board(){
		setLayout(new FlowLayout());
				
		JLabel lb1 = new JLabel("글제목");
		JLabel lb2 = new JLabel("작성일");
		JLabel lb3 = new JLabel("작성자");
		JLabel lb4 = new JLabel("내용");
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		ta = new JTextArea(10,30);
		
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(lb3); add(tf3);
		add(lb4); add(ta);
		
		bt1 = new JButton("글등록");
		add(bt1);
		bt2 = new JButton("다시쓰기");
		add(bt2);
		
//		Box v = Box.createVerticalBox();
//		v.add(tf1);
//		v.add(tf2);
//		v.add(tf3);
//		
//		pl = new JPanel();
//		pl.add(v, BorderLayout.NORTH);
//		
//		pll = new JPanel();
//		pll.add(ta, BorderLayout.CENTER);
//		
//		Box b = Box.createVerticalBox();
//		b.add(pl);
//				
//		add(tf1, "North");
//		add(tf2, "North");
//		add(tf3, "North");
//		add(ta, "Center");
		
		setSize(300,400);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Board();
	}

}
