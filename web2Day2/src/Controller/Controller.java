package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.View;

import Model.Calc;
import View.CalcView;

public class Controller implements ActionListener {

	CalcView view;

	public Controller() {
	      this.view=new CalcView();
	      this.view.btn.addActionListener(this);
	      
	      
	   }

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == view.btn) {
			// �Էµ� �׼��� view�� btn �׼��̶��,

			String n1 = view.n1.getText();
			String n2 = view.n2.getText();
			String op = view.op.getSelectedItem().toString();

			/////

			// �𵨰�ü ����
			Calc calc = new Calc(Integer.parseInt(n1), Integer.parseInt(n2), op);

			String res = calc.getRes();

			view.res.setText(res);

			view.reset();

		}

	}

}