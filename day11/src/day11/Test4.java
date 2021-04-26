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
		System.out.print("입금금액 입력: ");
		money += sc.nextInt();
		System.out.println("입금완료!");
	}
	void outM() {
		System.out.print("출금금액 입력: ");
		int i = sc.nextInt();
		if (money<i) {
			System.out.println("금액부족");
		}else {
			money -= i;
			System.out.println("출금완료!");
		}
	}
	void show() {
		System.out.println("현재 계좌에는 "+money+"원이 있습니다.");
	}
}

public class Test4 {
	public static void main(String[] args) {
		Account a1 = new Account("엄마");
		Account a2 = new Account("아빠");
		Account a3 = new Account("나");
		Account a4 = new Account("동생");
		a1.inM();
		a2.outM();
		a1.show();
	}
}
