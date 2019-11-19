import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorForm extends JFrame implements ActionListener {
	String[] title = { "C", "¡ç", "%", "¡À", "7", "8", "9", "¡¿", "4", "5", "6", "-", "1", "2", "3", "+", " ", "0", ".",
			"=" };
	JTextField tf;
	JPanel jp;

	public CalculatorForm() {
		super("°è»ê±â");
		tf = new JTextField();
		jp = new JPanel();
		jp.setLayout(new GridLayout(0, 4));

		for (int i = 0; i < title.length; i++)
			addButton(title[i], jp);

		Font font = new Font("°íµñ", Font.PLAIN, 30);
		tf.setFont(font);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tf.setEditable(false);
		tf.setForeground(Color.black);
		tf.setBackground(Color.white);
		add(tf, "North");
		add(jp, "Center");

//		GridLayout glayout = new GridLayout(5,4);
//		setLayout(glayout);
//		
//		JButton b[] = new JButton[20];
//		for (int i = 0; i < 20; i++) {
//			b[i] = new JButton(title[i]);
//			add(b[i]);
//		}

//		JPanel lpanel = new JPanel(new BorderLayout());
//		lpanel.setBorder(glayout);
//		lpanel.add(glayout, BorderLayout.CENTER);

//		tf = new JTextField();
//		tf.setEditable(false);
//		add(tf, "North");
//			g.addActionListener(b[i]);

		setSize(400, 400);
		setVisible(true);
	}

	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.setFont(new Font("°íµñ", Font.PLAIN, 20));
		target.add(button);
	}

	public static void main(String[] args) {
		CalculatorForm cf = new CalculatorForm();
		cf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
