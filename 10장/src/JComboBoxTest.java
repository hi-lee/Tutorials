import javax.swing.*;
import java.awt.*;
import java.util.*;

public class JComboBoxTest extends JFrame {
	JCheckBox jcb1, jcb2, jcb3, jcb4, jcb5;
	JComboBox jcm1, jcm2;
	JPanel jp1, jp2;
	String[] title = { "C", "비주얼베이직", "JAVA 프로그래밍", "자료구조", "이산수학" };
	

	JComboBoxTest() {
		super("콤보 박스 만들기");
		setLayout(new FlowLayout());
		jp1 = new JPanel();
		jcb1 = new JCheckBox("컴퓨터공학", true);
		jcb2 = new JCheckBox("전자상거래", true);
		jcb3 = new JCheckBox("경영학", false);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		add(jp1);

		jcm1 = new JComboBox(title);
		add(jcm1);
		
		Vector<String> vector = new Vector<>();
		vector.add("C");
		vector.add("자바");
		jcm2 = new JComboBox(vector);
		jcm2.addItem("test");
		jcm2.insertItemAt("test2", 1);
		jcm2.setSelectedIndex(2);	//2번 인덱스에 있는 '자바'가 기본 선택됨
		add(jcm2);
		
		setSize(300, 250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

	public static void main(String[] args) {
		new JComboBoxTest();
		
	}
}
