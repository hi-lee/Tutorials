import java.awt.*;
import javax.swing.*;

public class Calender extends JFrame {
	JTextField tfyear;
	JComboBox cbmonth;
	String[] month = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	JButton btn;
	String[] day = { "��", "��", "ȭ", "��", "��", "��", "��" };
	JPanel p1, calender;

	Calender() {
		super("�޷�");
		setLayout(new BorderLayout());
		calender = new JPanel();
		calender.setLayout(new GridLayout(0,7));
		p1 = new JPanel();
		
		tfyear = new JTextField(10);
		JLabel lb1 = new JLabel("��");
		cbmonth = new JComboBox(month);
		JLabel lb2 = new JLabel("��");
//		add(addButton("Ȯ��"));
		btn = new JButton("Ȯ��");		
		
		p1.add(tfyear);
		p1.add(lb1);
		p1.add(cbmonth);
		p1.add(btn);
		add(p1, "North");
		add(calender, "Center");
		add(addButton("<"), "West");
		add(addButton(">"), "East");
		
//		btn1 = new JButton("<"); ->button.addActionListener����ϱ⶧���� X				
//		btn2 = new JButton(">");						
//		add(btn1, "West");
//		add(btn2, "East");
			
		for (int i = 0; i < 49; i++) {			
			JTextField tf = new JTextField();
						
			if(i>=0 && i<=6) {			
//				calender.add(new JTextField(day[i]));
				tf.setText(day[i]);
			}else {
				calender.add(tf);
			}			
		}
	
		setSize(600, 600);
		setVisible(true);
	}
	JButton addButton(String str) {	//��ư �߰� �޼ҵ�
		JButton button = new JButton(str);
		return button;
	}
	public static void main(String[] args) {
		new Calender();
	}
}
