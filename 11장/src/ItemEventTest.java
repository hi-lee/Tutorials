import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.border.*;

public class ItemEventTest extends JFrame implements ActionListener {
	JLabel txt1, txt2, txt3;
	JRadioButton r1, r2, r3, r4, r5, r6;
	JCheckBox c1, c2, c3;
	ButtonGroup rgroup;
	JButton bt;
	public ItemEventTest() {
		super("ItemEvent 처리");
		setLayout(new FlowLayout());

		Box hBox = Box.createHorizontalBox();
		rgroup = new ButtonGroup();
		rgroup.add(r1 = new JRadioButton("우리투자증권"));
		hBox.add(r1);
		hBox.add(Box.createHorizontalStrut(30));
		rgroup.add(r2 = new JRadioButton("삼성증권"));
		hBox.add(r2);
		hBox.add(Box.createHorizontalStrut(30));
		rgroup.add(r3 = new JRadioButton("대우증권"));
		hBox.add(r3);
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(Box.createGlue());
		JPanel lpanel = new JPanel(new BorderLayout());
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "증권회사 구분"));
		lpanel.add(hBox);

		Box hhBox = Box.createHorizontalBox();
		ButtonGroup cgroup = new ButtonGroup();
		cgroup.add(r4 = new JRadioButton("국민은행"));
		hhBox.add(r4);
		hhBox.add(Box.createHorizontalStrut(30));
		cgroup.add(r5 = new JRadioButton("외환은행"));
		hhBox.add(r5);
		hhBox.add(Box.createHorizontalStrut(30));
		cgroup.add(r6 = new JRadioButton("기업은행"));
		hhBox.add(r6);
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(Box.createGlue());
		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "은행 구분"));
		llpanel.add(hhBox);

		Box hhhBox = Box.createHorizontalBox();
		JCheckBox jb = new JCheckBox();
		jb.add(c1 = new JCheckBox("독서"));
		hhhBox.add(c1);
		hhhBox.add(Box.createHorizontalStrut(30));
		jb.add(c2 = new JCheckBox("영화"));
		hhhBox.add(c2);
		hhhBox.add(Box.createHorizontalStrut(30));
		jb.add(c3 = new JCheckBox("오락"));
		hhhBox.add(c3);
		hhhBox.add(Box.createHorizontalStrut(30));
		hhhBox.add(Box.createGlue());
		JPanel lllpanel = new JPanel(new BorderLayout());
		lllpanel.setBorder(new TitledBorder(new EtchedBorder(), "취미 구분"));
		lllpanel.add(hhhBox);

		Box cBox = Box.createVerticalBox();
		cBox.add(lpanel);
		cBox.add(llpanel);
		cBox.add(lllpanel);
		txt1 = new JLabel("증권회사 출력됨");
		txt1.setFont(new Font("굴림", Font.PLAIN, 16));
		cBox.add(txt1);
		txt2 = new JLabel("은행 출력됨");
		txt2.setFont(new Font("굴림", Font.PLAIN, 16));
		cBox.add(txt2);
		txt3 = new JLabel("취미");
		txt3.setFont(new Font("굴림", Font.PLAIN, 16));
		cBox.add(txt3);
		add(cBox);
		bt = new JButton("확인");
		add(bt);

		RBHandler rh = new RBHandler();
		r1.addItemListener(rh);
		r2.addItemListener(rh);
		r3.addItemListener(rh);
		r4.addItemListener(rh);
		r5.addItemListener(rh);
		r6.addItemListener(rh);
		c1.addItemListener(rh);
		c2.addItemListener(rh);
		c3.addItemListener(rh);
		bt.addActionListener(this);
//		사용하고자하는 인터페이스가 달린 클래스로 값이 넘어감

	}

//	내부클래스
	private class RBHandler implements ItemListener {
		String str = new String();

		public void itemStateChanged(ItemEvent e) { // Override
			if (e.getSource() == r1)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 우리투자증권");
			if (e.getSource() == r2)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 삼성증권");
			if (e.getSource() == r3)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt1.setText("선택 : 대우증권");
			if (e.getSource() == r4)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt2.setText("선택 : 국민은행");
			if (e.getSource() == r5)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt2.setText("선택 : 외환은행");
			if (e.getSource() == r6)
				if (e.getStateChange() == ItemEvent.SELECTED)
					txt2.setText("선택 : 기업은행");
			if (e.getSource() == c1) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					str += "독서 ";
				else
					str = str.replace("독서", " ");
			}
			if (e.getSource() == c2) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					str += "영화 ";
				else
					str = str.replace("영화", " ");
			}
			if (e.getSource() == c3) {
				if (e.getStateChange() == ItemEvent.SELECTED)
					str += "오락 ";
				else
					str = str.replace("오락", " ");
			}
			str = str.trim();
			if(str.trim().isEmpty()) txt3.setText("취미 : 없음");
			else txt3.setText("취미 : " + str.trim());

//			String str[i] = new String[3];
//			if str[0] = "독서";
//			else str[0]="";
//			for(int i=0; i<str.length; i++) {
//				txt3.setText(txt3.getText() + str[i]);
//			}
		}
	}

	public static void main(String args[]) {
		ItemEventTest iet = new ItemEventTest();
		iet.setDefaultCloseOperation(EXIT_ON_CLOSE);
		iet.setSize(400, 300);
		iet.setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0) {
		String str = "";
		Enumeration <AbstractButton> enums = rgroup.getElements();
		while(enums.hasMoreElements()) {
			AbstractButton ab = enums.nextElement();
			JRadioButton jb = (JRadioButton) ab;
			if(jb.isSelected()) str = jb.getText();
		}
		JOptionPane.showMessageDialog(this, str);
	}

}
