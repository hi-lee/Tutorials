import java.awt.*;
import javax.swing.*;

public class Board extends JFrame {
	JTextField tf1, tf2, tf3;
	JTextArea ta;
	JButton bt1, bt2;
	
	Board(){
		setLayout(new FlowLayout());
				
		JLabel lb1 = new JLabel("������");
		JLabel lb2 = new JLabel("�ۼ���");
		JLabel lb3 = new JLabel("�ۼ���");
		JLabel lb4 = new JLabel("����");
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		ta = new JTextArea(10,30);
		
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(lb3); add(tf3);
		add(lb4); add(ta);
		
		bt1 = new JButton("�۵��");
		add(bt1);
		bt2 = new JButton("�ٽþ���");
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
