import javax.swing.*;
import java.awt.*;

public class NullContainer extends JFrame{
	JButton jbtn1, jbtn2, jbtn3;
	NullContainer(){
		super("Null Container�� ��ư ��ġ");
		setLayout(null);
		jbtn1 = new JButton("�Է�");
//		jbtn1.setLocation(20,50);
//		jbtn1.setSize(100,30);	Location+Size=Bounds
		jbtn1.setBounds(20,50,100,30);	//�����̳ʿ� ���̾ƿ��� ������(setLayout(null)) ũ��,��ġ �����ؾ���
		jbtn2 = new JButton("�߰�");
		jbtn2.setBounds(20,100,100,30);
		jbtn3 = new JButton("����");
		jbtn3.setBounds(20,150,100,30);
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new NullContainer();
	}

}
