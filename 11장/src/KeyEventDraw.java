import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEventDraw extends JFrame implements KeyListener {
	String kname = " ";
	JTextField tf;

	public KeyEventDraw() {
		// TODO Auto-generated constructor stub
		setFocusable(true);
		addKeyListener(this);
		tf = new JTextField();
		tf.setEditable(false);
		Font font = new Font("고딕", Font.PLAIN, 15);
		tf.setFont(font);
		tf.setForeground(Color.blue);
		tf.setBackground(Color.white);
		add(tf, "South");
		
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
//	public void paint(Graphics g) {
//		g.setColor(Color.red);
//		g.drawString("키보드의 키를 누르면", 20, 20);
//		g.setColor(Color.blue);
//		g.drawString("키이름, 키값 표시", 20, 40);
//	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		kname = "Key Pressde : " + e.getKeyText(e.getKeyCode());
		tf.setText(kname);
//		showStatus(kname); JFrame에는 없음
//		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new KeyEventDraw();
	}

}
