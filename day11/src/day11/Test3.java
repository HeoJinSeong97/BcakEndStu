package day11;

import java.util.Scanner;

class Bank {
	Scanner sc = new Scanner(System.in);
	private String user;
	private int money;
	private String password;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String user, String password) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.password = password;
	}

	void payIN(int money) {
		System.out.println("�Ա����� : " + money);
		if (checkPassword()) {
			System.out.println("�ԱݿϷ�!");
			this.money = money;
		} else {
			System.out.println("�߸��� �����Դϴ�.");
		}
	}

	void payOUT(int money) {
		System.out.println("��ü���� : " + money);
		if (checkPassword()) {
			if (this.money >= money) {
				System.out.println("��ü�Ϸ�!");
				this.money = money;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
				return;
			}
		} else {
			System.out.println("�߸��� �����Դϴ�.");
			return;
		}
	}

	boolean checkPassword() {
		System.out.print(user + "�� ��й�ȣ�� �Է����ּ���: ");
		String pwd = sc.next();
		if (this.password.equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}

	void show() {
		System.out.println(user + "���� ���¿��� " + money + "���� �ֽ��ϴ�.");
	}
}

public class Test3 {
	public static void main(String[] args) {
		Bank a = new Bank("������", "971104");
		Scanner sc = new Scanner(System.in);
		while(true) {
	         
	         
	         System.out.println();
	         System.out.println("1.��� 2.�Ա� 3.Ȯ�� 4.����");
	         System.out.print("��ݱݾ� �Է�: ");
	         int act=sc.nextInt();
	         
	         if(act==1) {
	        	 System.out.print("�Աݱݾ� �Է�: ");
	        	 a.payOUT(sc.nextInt());
	         }
	         else if(act==2) {
	        	 System.out.print("�Է�: ");
	        	 a.payIN(sc.nextInt());
	         }
	         else if(act==3) {
	        	 a.show();
	         }
	         else if(act==4) {
	            break; // "��������"
	         }
	         else {
	            System.out.println("��ȿ�������� �Է��Դϴ�.");
	         }

	}
	}}
