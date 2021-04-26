package day14;

import java.util.Scanner;

class Coffee{
	   boolean coffee;
	   String name;
	   int price;
	   int cnt;
	   Coffee(String name,int price){
	      this(name,price,true);
	   }
	   Coffee(String name,int price,boolean coffee){
	      this.name=name;
	      this.price=price;
	      this.coffee=coffee;
	      this.cnt=3;
	   }
	   void out() {
	      System.out.println(this.name+"�� �غ�Ǿ����ϴ�.");
	      System.out.println("����: "+this.price);
	      System.out.println("���: "+this.cnt);
	   }
	}
	class Milk extends Coffee{
	   boolean milk;
	   static String[] type={"����","����","���������"};
	   int index;
	   Milk(String name,int price){
	      super(name,price);
	      this.milk=true;
	      this.index=0;
	   }
	   void out() {
	      super.out();
	      if(this.milk) {
	         System.out.println("����� ������ "+type[this.index]+"�Դϴ�.");
	      }
	   }
	}
	class Ice extends Milk{
	   boolean ice;
	   Ice(String name,int price){
	      super(name,price);
	      this.ice=true;
	   }
	   void out() {
	      System.out.print("���̽� ");
	      super.out();
	   }
	}


public class Test1 {
	public static void main(String[] args) {
		Coffee[] data = new Coffee[4];
		data[0] = new Coffee("�Ƹ޸�ī��", 2000);
		data[1] = new Coffee("����", 2000, false);
		data[2] = new Milk("��", 2000);
		data[3] = new Ice("����Ǫġ��", 5000);
		
		for (Coffee coffee : data) {
			coffee.out();
		}
	}
}
