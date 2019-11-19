import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame implements ActionListener{
	JButton jbtn1, jbtn2, jbtn3;
	JTextField tf;	//멤버변수 선언: 생성은 생성자 내에서, 사용은 메소드 내에서 하기때문
	
	JButtonTest() {
		super("버튼(JButton) 추가");
		setLayout(new FlowLayout());
		
		jbtn1 = new JButton("입력");
		add(jbtn1);		
		jbtn2 = new JButton("추가");
		add(jbtn2);
		jbtn3 = new JButton("삭제");
		add(jbtn3);
		
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		jbtn3.addActionListener(this);
		
		tf = new JTextField(20);
//		tf.setEditable(false);
		add(tf,"South");
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JButtonTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		tf.setText(e.getActionCommand()); ->출력 동작만 하기때문에 가능
//		lbl.setText(e.getActionCommand());
//		System.out.println(e.getActionCommand());
		if(e.getActionCommand().contentEquals("입력")) tf.setText(e.getActionCommand());
		if(e.getActionCommand().equals("추가")) tf.setText(e.getActionCommand());
		if(e.getActionCommand().equals("삭제")) tf.setText(e.getActionCommand());
	}
}
