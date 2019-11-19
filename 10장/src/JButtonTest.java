import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonTest extends JFrame implements ActionListener{
	JButton jbtn1, jbtn2, jbtn3;
	JTextField tf;	//������� ����: ������ ������ ������, ����� �޼ҵ� ������ �ϱ⶧��
	
	JButtonTest() {
		super("��ư(JButton) �߰�");
		setLayout(new FlowLayout());
		
		jbtn1 = new JButton("�Է�");
		add(jbtn1);		
		jbtn2 = new JButton("�߰�");
		add(jbtn2);
		jbtn3 = new JButton("����");
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
//		tf.setText(e.getActionCommand()); ->��� ���۸� �ϱ⶧���� ����
//		lbl.setText(e.getActionCommand());
//		System.out.println(e.getActionCommand());
		if(e.getActionCommand().contentEquals("�Է�")) tf.setText(e.getActionCommand());
		if(e.getActionCommand().equals("�߰�")) tf.setText(e.getActionCommand());
		if(e.getActionCommand().equals("����")) tf.setText(e.getActionCommand());
	}
}
