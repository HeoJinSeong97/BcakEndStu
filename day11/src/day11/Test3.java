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
		System.out.println("입금정보 : " + money);
		if (checkPassword()) {
			System.out.println("입금완료!");
			this.money = money;
		} else {
			System.out.println("잘못된 정보입니다.");
		}
	}

	void payOUT(int money) {
		System.out.println("이체정보 : " + money);
		if (checkPassword()) {
			if (this.money >= money) {
				System.out.println("이체완료!");
				this.money = money;
			} else {
				System.out.println("잔액이 부족합니다.");
				return;
			}
		} else {
			System.out.println("잘못된 정보입니다.");
			return;
		}
	}

	boolean checkPassword() {
		System.out.print(user + "님 비밀번호를 입력해주세요: ");
		String pwd = sc.next();
		if (this.password.equals(pwd)) {
			return true;
		} else {
			return false;
		}
	}

	void show() {
		System.out.println(user + "님의 계좌에는 " + money + "원이 있습니다.");
	}
}

public class Test3 {
	public static void main(String[] args) {
		Bank a = new Bank("허진성", "971104");
		Scanner sc = new Scanner(System.in);
		while(true) {
	         
	         
	         System.out.println();
	         System.out.println("1.출금 2.입금 3.확인 4.종료");
	         System.out.print("출금금액 입력: ");
	         int act=sc.nextInt();
	         
	         if(act==1) {
	        	 System.out.print("입금금액 입력: ");
	        	 a.payOUT(sc.nextInt());
	         }
	         else if(act==2) {
	        	 System.out.print("입력: ");
	        	 a.payIN(sc.nextInt());
	         }
	         else if(act==3) {
	        	 a.show();
	         }
	         else if(act==4) {
	            break; // "종료조건"
	         }
	         else {
	            System.out.println("유효하지않은 입력입니다.");
	         }

	}
	}}
