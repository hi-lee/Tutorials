import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BoxLayoutTest extends JFrame {
	public BoxLayoutTest() { 	// �ڽ����̾ƿ��� �޼ҵ�� ����(������X)
		super("�ڽ� ���̾ƿ�");

		Box hBox = Box.createHorizontalBox();	//����ڽ� 7�� ����
		hBox.add(Box.createHorizontalStrut(30));	//üũ�ڽ� �տ� 30��ŭ ���� ����
		hBox.add(new JCheckBox("�츮��������"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("�Ｚ����"));
		hBox.add(Box.createHorizontalStrut(30));
		hBox.add(new JCheckBox("�������"));
		hBox.add(Box.createGlue());	//�պκ��� ����, �޺κ��� �þ (Flow:������ü�� �þ�� �پ��)

		JPanel lpanel = new JPanel(new BorderLayout());
		lpanel.setBorder(new TitledBorder(new EtchedBorder(), "����ȸ�� ����"));	//�г��� �׵θ�(border), titledborder: ������ ���� border����
	 	lpanel.add(hBox, BorderLayout.CENTER);	//�ڽ��� �гο� ����, CENTER: ũ�⿡ ���� ������ ����

		Box hhBox = Box.createHorizontalBox();
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("��������"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("��ȯ����"));
		hhBox.add(Box.createHorizontalStrut(30));
		hhBox.add(new JCheckBox("�������"));
		hhBox.add(Box.createGlue());

		JPanel llpanel = new JPanel(new BorderLayout());
		llpanel.setBorder(new TitledBorder(new EtchedBorder(), "���� ����"));
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
