package day11;

import java.util.Scanner;

class Account{
	static int ck = 0;
	String name;
	static int money;
	Scanner sc = new Scanner(System.in);
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		if(ck == 0)money = 10000;
		ck = 1;
		
		
	}
	void inM() {
		System.out.print("�Աݱݾ� �Է�: ");
		money += sc.nextInt();
		System.out.println("�ԱݿϷ�!");
	}
	void outM() {
		System.out.print("��ݱݾ� �Է�: ");
		int i = sc.nextInt();
		if (money<i) {
			System.out.println("�ݾ׺���");
		}else {
			money -= i;
			System.out.println("��ݿϷ�!");
		}
	}
	void show() {
		System.out.println("���� ���¿��� "+money+"���� �ֽ��ϴ�.");
	}
}

public class Test4 {
	public static void main(String[] args) {
		Account a1 = new Account("����");
		Account a2 = new Account("�ƺ�");
		Account a3 = new Account("��");
		Account a4 = new Account("����");
		a1.inM();
		a2.outM();
		a1.show();
	}
}
