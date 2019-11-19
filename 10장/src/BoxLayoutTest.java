import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame {
	public BoxLayoutTest() { 	// 박스레이아웃은 메소드로 만듦(생성자X)
		super("박스 레이아웃");

		Box hBox = Box.createHorizontalBox();	//수평박스 7개 생성
		hBox.add(Box.createHorizontalStrut(30));	//체크박스 앞에 30만큼 공백 넣음
		hBox.add(new JCheckBox("우리투자증권"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("삼성증권"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("대우증권"));
		hBox.add(Box.createGlue());	//앞부분은 고정, 뒷부분이 늘어남 (Flow:내용전체가 늘어나고 줄어듦)

		JPanel lpanel = new JPanel(new BorderLayout());
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));	//패널의 테두리(border), titledborder: 제목을 가진 border설정
	 	lpanel.add(hBox, BorderLayout.CENTER);	//박스를 패널에 넣음, CENTER: 크기에 따라 내용이 꽉참

		Box hhBox = Box.createHorizontalBox();
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("국민은행"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("외환은행"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("기업은행"));
		hhBox.add(Box.createGlue());

		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		llpanel.add(hhBox, BorderLayout.CENTER);

		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel);
		cBox.add(llpanel);
		add(cBox, BorderLayout.CENTER);
	}

	public static void main(String args[]) {
		BoxLayoutTest blt = new BoxLayoutTest();
		blt.setDefaultCloseOperation(EXIT_ON_CLOSE);
		blt.setSize(400, 200);
		blt.setVisible(true);
	}

}
