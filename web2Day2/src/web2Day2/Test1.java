package web2Day2;

import javax.swing.JOptionPane;

public class Test1 {
	public static void main(String[] args) {
		JOptionPane pane = new JOptionPane();
		
		String ans = pane.showInputDialog("����: ", "�亯");
		System.out.println(ans);
		
		String[] comboBox = {"���", "�ٳ���", "Ű��"};
		Object select = JOptionPane.showInputDialog(null, "��������", "����", JOptionPane.QUESTION_MESSAGE, null, comboBox, comboBox[0]);
		System.out.println(select);
		
		
		
	}
}
