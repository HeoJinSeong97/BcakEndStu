package day12;

import java.util.Scanner;

class Ac{
	   Ac(String name){
	      this.name=name;
	   }
	   String name;
	   static int money=10000; // ���� ������
	   void inMoney(int money) {
	      Ac.money+=money;
	      System.out.println("�ԱݿϷ�!");
	   }
	   boolean outMoney(int money) {
	      if(Ac.money<money) {
	         System.out.println("�ݾ׺���!");
	         return false;
	      }
	      Ac.money-=money;
	      System.out.println("��ݿϷ�!");
	      return true;
	   }
	}


public class Test2 {
	

		public static void main(String[] args) {

		      Scanner sc=new Scanner(System.in);

		      int num;
		      do {
		         System.out.print("����Է�: ");
		         num=sc.nextInt();
		      }while(num<2); // ��ȿ���˻�
		      System.out.println();

		      Ac[] data=new Ac[num];

		      for(int i=0;i<num;i++) {
		         System.out.print("����"+(i+1)+" �̸��Է�: ");
		         String name=sc.next();
		         data[i]=new Ac(name);
		      }
		      System.out.println();

		      while(true) {
		         int n;
		         do {
		            System.out.print("��ȣ����: ");
		            n=sc.nextInt();
		         }while(n<=0 || num<n);
		         System.out.println();
		         
		         System.out.println(data[n-1].name+"��...");
		         System.out.print("1_IN  2_OUT   ");
		         int m=sc.nextInt();
		         
		         System.out.print("�ݾ��Է�: ");
		         int money=sc.nextInt();
		         if(m==1) {
		            data[n-1].inMoney(sc.nextInt());
		         }
		         else {
		            if(!data[n-1].outMoney(sc.nextInt())) { // ���� �����ϴٸ�, -> "��������" �����ϱ�!!
		               break; // "�ݺ���"�� �ٱ����� ��� �̵�!
		            }
		            
		         }
		         System.out.println();
		      }

		      System.out.println("���α׷� ����...");
		   }

		}
