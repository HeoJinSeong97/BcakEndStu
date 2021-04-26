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
	      System.out.println(this.user+"���� ����Ʈ: "+this.point+"��");
	   }
	   @Override
	   public boolean checkPw() {
	      Scanner sc=new Scanner(System.in);
	      System.out.print("��й�ȣ�Է�: ");
	      int pw=sc.nextInt();
	      if(this.pw==pw) {
	         return true;
	      }
	      System.out.println("��й�ȣ ����ġ!");
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
	class CheckCard extends Card implements Bae{ // "���ȭ"

	   CheckCard(String user, int pw) {
	      super(user, pw);
	      
	   }

	   @Override
	   public void buy(int money) {
	      if(!checkPw()) {
	         return;
	      }
	      this.point+= money*rate;
	      System.out.println("�����Ϸ�!");
	   }
	   // ���Ž�, ��й�ȣ�� Ȯ���Ŀ� ��������

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
	   // ���̰� 20�̻��̸� 2000��,�̸��̸� 1000���� �����Ѵ�.
	   // ��й�ȣ Ȯ��xxx

	   @Override
	   public void buy(int money) {
	      if(money==2000) {
	         System.out.println("2000�� ����");
	      }
	      else {
	         System.out.println("1000�� ����");
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
		BusCard b = new BusCard("������",20);
		CheckCard c = new CheckCard("������", 971104);
		c.buy(2000);
		b.buy();
	}
	
}
