package web2Day2;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JPanel pane = new JPanel();
		pane.setLayout(new BorderLayout());
		pane.add(new JLabel("gui�ǽ�"), BorderLayout.NORTH);
		
		
		JButton jb = new JButton("clik");
		pane.add(jb, BorderLayout.EAST);
		
		JTextArea ja = new JTextArea(100,100);
		pane.add(ja, BorderLayout.CENTER);
		
//		������
//		�׼�, �̺�Ʈ
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ja.append("���� �߰�����ϴ�.");
			}
		});
		ImageIcon img = new ImageIcon("C:\\Users\\82109\\Desktop\\�� ����\\iu\\LILAC.png");
		JButton jb2 = new JButton(img);
		pane.add(jb2, BorderLayout.EAST);
		
		frame.add(pane);
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
