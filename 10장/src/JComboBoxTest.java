import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JComboBoxTest extends JFrame {
	JCheckBox jcb1, jcb2, jcb3, jcb4, jcb5;
	JComboBox jcm1, jcm2;
	JPanel jp1, jp2;
	String[] title = { "C", "���־�����", "JAVA ���α׷���", "�ڷᱸ��", "�̻����" };
	

	JComboBoxTest() {
		super("�޺� �ڽ� �����");
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jcb1 = new JCheckBox("��ǻ�Ͱ���", true);
		jcb2 = new JCheckBox("���ڻ�ŷ�", true);
		jcb3 = new JCheckBox("�濵��", false);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		add(jp1);

		jcm1 = new JComboBox(title);
		add(jcm1);
		
		Vector<String> vector = new Vector<>();
		vector.add("C");
		vector.add("�ڹ�");
		jcm2 = new JComboBox(vector);
		jcm2.addItem("test");
		jcm2.insertItemAt("test2", 1);
		jcm2.setSelectedIndex(2);	//2�� �ε����� �ִ� '�ڹ�'�� �⺻ ���õ�
		add(jcm2);
		
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

	public static void main(String[] args) {
		new JComboBoxTest();
		
	}
}
