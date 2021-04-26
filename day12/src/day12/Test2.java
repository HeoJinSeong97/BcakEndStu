package day12;

import java.util.Scanner;

class Ac{
	   Ac(String name){
	      this.name=name;
	   }
	   String name;
	   static int money=10000; // 공유 데이터
	   void inMoney(int money) {
	      Ac.money+=money;
	      System.out.println("입금완료!");
	   }
	   boolean outMoney(int money) {
	      if(Ac.money<money) {
	         System.out.println("금액부족!");
	         return false;
	      }
	      Ac.money-=money;
	      System.out.println("출금완료!");
	      return true;
	   }
	}


public class Test2 {
	

		public static void main(String[] args) {

		      Scanner sc=new Scanner(System.in);

		      int num;
		      do {
		         System.out.print("명수입력: ");
		         num=sc.nextInt();
		      }while(num<2); // 유효성검사
		      System.out.println();

		      Ac[] data=new Ac[num];

		      for(int i=0;i<num;i++) {
		         System.out.print("가족"+(i+1)+" 이름입력: ");
		         String name=sc.next();
		         data[i]=new Ac(name);
		      }
		      System.out.println();

		      while(true) {
		         int n;
		         do {
		            System.out.print("번호선택: ");
		            n=sc.nextInt();
		         }while(n<=0 || num<n);
		         System.out.println();
		         
		         System.out.println(data[n-1].name+"가...");
		         System.out.print("1_IN  2_OUT   ");
		         int m=sc.nextInt();
		         
		         System.out.print("금액입력: ");
		         int money=sc.nextInt();
		         if(m==1) {
		            data[n-1].inMoney(sc.nextInt());
		         }
		         else {
		            if(!data[n-1].outMoney(sc.nextInt())) { // 돈이 부족하다면, -> "종료조건" 구현하기!!
		               break; // "반복문"의 바깥으로 즉시 이동!
		            }
		            
		         }
		         System.out.println();
		      }

		      System.out.println("프로그램 종료...");
		   }

		}
