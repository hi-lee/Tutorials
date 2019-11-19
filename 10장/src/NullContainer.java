import javax.swing.*;
import java.awt.*;

public class NullContainer extends JFrame{
	JButton jbtn1, jbtn2, jbtn3;
	NullContainer(){
		super("Null Container의 버튼 배치");
		setLayout(null);
		jbtn1 = new JButton("입력");
//		jbtn1.setLocation(20,50);
//		jbtn1.setSize(100,30);	Location+Size=Bounds
		jbtn1.setBounds(20,50,100,30);	//컨테이너에 레이아웃이 없으면(setLayout(null)) 크기,위치 설정해야함
		jbtn2 = new JButton("추가");
		jbtn2.setBounds(20,100,100,30);
		jbtn3 = new JButton("삭제");
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
