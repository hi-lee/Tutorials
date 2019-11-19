import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseInputEvent extends JFrame implements MouseListener {
	String msg;
	JLabel sbar;

	public MouseInputEvent() {
		super("마우스에서의 InputEvnet");
		sbar = new JLabel();
		add(sbar, BorderLayout.SOUTH);
		addMouseListener(this);
		setSize(300, 200);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) { //숫자&숫자 ->같은숫자 아니면 0 나옴, ==사용가능
			msg = "마우스 오른쪽 버튼을 눌렀습니다.";
		} else {
			msg = "마우스 왼쪽 버튼을 눌렀습니다.";
		}
		sbar.setText(msg);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		msg = "마우스 버튼을 누르세요.";	//처음 실행시 버튼을 누른적이 없기때문에 메소드 실행X
		sbar.setText(msg);
	}

	public static void main(String[] args) {
		MouseInputEvent mie = new MouseInputEvent();
		mie.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
