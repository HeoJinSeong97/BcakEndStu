package day12;

import java.util.Scanner;

class Card {
	String name;
	private int password;

	public Card(String name, int password) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.password = password;
	}

	public void setPasswd(int password) {
		this.password = password;
	}

	public int getPasswd() {
		return password;
	}

}

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Card card = new Card("ȫ�浿", 1234);

//	      System.out.println(card.name);
		//
//	      System.out.println(card.getPasswd());
//	      card.setPasswd(5678);
//	      System.out.println(card.getPasswd());

		while (true) {
			System.out.println();
			System.out.println("1.ī�峻��Ȯ�� 2.��й�ȣ���� 3.����");
			System.out.print("�Է�: ");
			int num = sc.nextInt();
			if (num == 3) {
				break;
			} else if (num < 1 || 3 < num) {
				System.out.println("�߸��Է�!");
			} else if (num == 1) {
				System.out.println(card.name + "���� ��й�ȣ�� [" + card.getPasswd() + "]�Դϴ�.");
			} else {
				// ��й�ȣ����
				System.out.print("���� ��й�ȣ�Է�: ");
				int passwd = sc.nextInt();
				if (passwd == card.getPasswd()) {
					System.out.print("���ο� ��й�ȣ�Է�: ");
					passwd = sc.nextInt();
					card.setPasswd(passwd);
					System.out.println("��й�ȣ ����Ϸ�!!!");
				} else {
					System.out.println("��й�ȣ ����ġ!!!");
				}
			}

		}

	}

}
