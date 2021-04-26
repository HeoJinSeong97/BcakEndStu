package day15;

import java.util.Scanner;

abstract class Card implements useCard{ 
	   Card(String user,int pw){
	      this.point=0;
	      this.user=user;
	      this.pw=pw;
	   }
	   String user;
	   private int pw;
	   public int getPw() {
	      return pw;
	   }
	   public void setPw(int pw) {
	      this.pw = pw;
	   }
	   int point;
	   void show() {
	      System.out.println(this.user+"님의 포인트: "+this.point+"점");
	   }
	   @Override
	   public boolean checkPw() {
	      Scanner sc=new Scanner(System.in);
	      System.out.print("비밀번호입력: ");
	      int pw=sc.nextInt();
	      if(this.pw==pw) {
	         return true;
	      }
	      System.out.println("비밀번호 불일치!");
	      return false;
	   }
	}
	interface useCard{
	   double rate=0.5;
	   boolean checkPw();
	   void buy(int money);
	}
	interface Bae{
	   void study();
	}
	class CheckCard extends Card implements Bae{ // "모듈화"

	   CheckCard(String user, int pw) {
	      super(user, pw);
	      
	   }

	   @Override
	   public void buy(int money) {
	      if(!checkPw()) {
	         return;
	      }
	      this.point+= money*rate;
	      System.out.println("결제완료!");
	   }
	   // 구매시, 비밀번호를 확인후에 결제진행

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}
	}
	class BusCard extends Card{
	   BusCard(String user, int age) {
	      super(user,0000);
	      this.age=age;
	   }
	   int age;
	   // 나이가 20이상이면 2000원,미만이면 1000원을 결제한다.
	   // 비밀번호 확인xxx

	   @Override
	   public void buy(int money) {
	      if(money==2000) {
	         System.out.println("2000원 결제");
	      }
	      else {
	         System.out.println("1000원 결제");
	      }
	   }
	   public void buy() {
	      if(this.age>=20) {
	         this.buy(2000);
	      }
	      else {
	         this.buy(1000);
	      }
	      
	   }
	}

public class Test6 {
	public static void main(String[] args) {
		BusCard b = new BusCard("허진성",20);
		CheckCard c = new CheckCard("허진성", 971104);
		c.buy(2000);
		b.buy();
	}
	
}
