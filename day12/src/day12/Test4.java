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
		Card card = new Card("홍길동", 1234);

//	      System.out.println(card.name);
		//
//	      System.out.println(card.getPasswd());
//	      card.setPasswd(5678);
//	      System.out.println(card.getPasswd());

		while (true) {
			System.out.println();
			System.out.println("1.카드내용확인 2.비밀번호변경 3.종료");
			System.out.print("입력: ");
			int num = sc.nextInt();
			if (num == 3) {
				break;
			} else if (num < 1 || 3 < num) {
				System.out.println("잘못입력!");
			} else if (num == 1) {
				System.out.println(card.name + "님의 비밀번호는 [" + card.getPasswd() + "]입니다.");
			} else {
				// 비밀번호변경
				System.out.print("현재 비밀번호입력: ");
				int passwd = sc.nextInt();
				if (passwd == card.getPasswd()) {
					System.out.print("새로운 비밀번호입력: ");
					passwd = sc.nextInt();
					card.setPasswd(passwd);
					System.out.println("비밀번호 변경완료!!!");
				} else {
					System.out.println("비밀번호 불일치!!!");
				}
			}

		}

	}

}
