package web2Day2;

import javax.swing.JOptionPane;

public class Test1 {
	public static void main(String[] args) {
		JOptionPane pane = new JOptionPane();
		
		String ans = pane.showInputDialog("질문: ", "답변");
		System.out.println(ans);
		
		String[] comboBox = {"사과", "바나나", "키워"};
		Object select = JOptionPane.showInputDialog(null, "질문내용", "제목", JOptionPane.QUESTION_MESSAGE, null, comboBox, comboBox[0]);
		System.out.println(select);
		
		
		
	}
}
