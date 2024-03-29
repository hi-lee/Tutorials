import javax.swing.*;
import java.awt.*;

public class JCheckBoxButton extends JFrame {
	JCheckBox jcb1, jcb2, jcb3, jcb4;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6, jrb7;
	JPanel jp1, jp2, jp3, jp4, jp5;

	JCheckBoxButton() {
		super("체크박스와 라디오 버튼 만들기");
//		setLayout이 없는경우->border Layout: 위치 지정함(North, East, South, West, Center) 
//		한 위치에 하나만 가능(두개 추가시 덮어쓰기)
		jp1 = new JPanel();
		jcb1 = new JCheckBox("음악감상", true);
		jcb2 = new JCheckBox("등산", true);
		jcb3 = new JCheckBox("조깅", false);
		jcb4 = new JCheckBox("공부", true);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		add(jp1, "North");

		jp2 = new JPanel();
		jrb1 = new JRadioButton("결혼", true);
		jrb2 = new JRadioButton("미혼", false);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jrb1); // ButtonGroup: 논리적으로 묶어주기위해 추가
		bg1.add(jrb2);
		jp2.add(jrb1); // 패널은 보여주기 위해 추가
		jp2.add(jrb2);
//		add(jp2, "Center"); //ButtonGroup는 논리그룹이기때문에 패널을 버튼에 넣어야함

		jp4 = new JPanel();
		jrb6 = new JRadioButton("남", true);
		jrb7 = new JRadioButton("여", false);
		ButtonGroup bg3 = new ButtonGroup();
		bg3.add(jrb6);
		bg3.add(jrb7);
		jp4.add(jrb6);
		jp4.add(jrb7);
//		add(jp4, "Center");

		jp5 = new JPanel(); //jp2, 4를 한패널로 합쳐서 그안에서 패널끼리 위치를 나누고, jp5패널의 위치를 중앙으로 잡음
		jp5.setLayout(new BorderLayout()); // 창을 늘려도 패널이 flow상태안됨
		jp5.add(jp2, "North"); // Center의 위에 위치
		jp5.add(jp4, "Center"); // Center의 중앙에 위치
		add(jp5, "Center");

		jp3 = new JPanel();
		jrb3 = new JRadioButton("자가", true);
		jrb4 = new JRadioButton("전세", false);
		jrb5 = new JRadioButton("월세", false);
		ButtonGroup bg2 = new ButtonGroup();
		bg2.add(jrb3);
		bg2.add(jrb4);
		bg2.add(jrb5);
		jp3.add(jrb3);
		jp3.add(jrb4);
		jp3.add(jrb5);
		add(jp3, "South");

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JCheckBoxButton();
	}
}
