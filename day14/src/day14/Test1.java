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
	      System.out.println(this.name+"가 준비되었습니다.");
	      System.out.println("가격: "+this.price);
	      System.out.println("재고: "+this.cnt);
	   }
	}
	class Milk extends Coffee{
	   boolean milk;
	   static String[] type={"우유","두유","저지방우유"};
	   int index;
	   Milk(String name,int price){
	      super(name,price);
	      this.milk=true;
	      this.index=0;
	   }
	   void out() {
	      super.out();
	      if(this.milk) {
	         System.out.println("사용한 우유는 "+type[this.index]+"입니다.");
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
	      System.out.print("아이스 ");
	      super.out();
	   }
	}


public class Test1 {
	public static void main(String[] args) {
		Coffee[] data = new Coffee[4];
		data[0] = new Coffee("아메리카노", 2000);
		data[1] = new Coffee("녹차", 2000, false);
		data[2] = new Milk("라떼", 2000);
		data[3] = new Ice("프라푸치노", 5000);
		
		for (Coffee coffee : data) {
			coffee.out();
		}
	}
}
