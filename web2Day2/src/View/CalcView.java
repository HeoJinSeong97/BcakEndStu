package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JFrame {

	public JTextField n1, n2;
	public JComboBox<String> op;
	public JButton btn;
	public JLabel res;

	JPanel panel;

	public CalcView() {
		setTitle("계산기 실습");

		int size = 10;
		n1 = new JTextField(size);
		n2 = new JTextField(size);

		op = new JComboBox();
		op.addItem("+");
		op.addItem("-");

		btn = new JButton("계산하기");
		res = new JLabel();

		setLayout(new FlowLayout());
		panel = new JPanel();
		panel.add(n1);
		panel.add(op);
		panel.add(n2);
		panel.add(btn);

		add(panel);
		add(res);

		setVisible(true);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void reset() {
		n1.setText("");
		n2.setText(null);
	}

}