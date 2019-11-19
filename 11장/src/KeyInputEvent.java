import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KeyInputEvent extends JFrame implements KeyListener {
	String msg;
	JLabel sbar;
	public KeyInputEvent() {
		super("키보드에서의 InputEvent");
		sbar = new JLabel();
		add(sbar);	//BorderLayout이기때문에 위치는 Center
		addKeyListener(this);
		setSize(300,200);
		setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		msg = "KeyPressed : " + e.getKeyText(e.getKeyCode());
		if(e.isShiftDown()) { msg += "<Shift>"; }
		if(e.isControlDown()) { msg += "<Ctrl>"; }
		if(e.isAltDown()) { msg += "<Alt>";}
		
		sbar.setText(msg);
	}
	@Override
	public void keyReleased(KeyEvent e) {
//		동작안함(keyReleased에서 Down사용했기때문)
		// TODO Auto-generated method stub
		msg = "KeyReleased : " + e.getKeyText(e.getKeyCode());
		if(e.isShiftDown()) { msg += "<Shift>";}
		if(e.isControlDown()) { msg += "<Crtl>";}
		if(e.isAltDown()) { msg += "<Alt>"; }
		
		sbar.setText(msg);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		KeyInputEvent kie = new KeyInputEvent();
		kie.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
