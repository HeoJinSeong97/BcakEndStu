package day13;

import java.util.Scanner;

public class ssdsd {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		   int n = 0;
		    int[] m = new int[2];

		    for (int i = 0; i < m.length; i++) {
		       System.out.print("���� �Է�(0���� ũ�� ������������ �Է��Ѵ�.)");
		       n = sc.nextInt();
		       m[i] = n;
		       System.out.println(i + "��°�� �Է¿Ϸ�");
		    }
		    int gcm = m[0];
		    int a, b; 
		    int r = 1; 
		   
		   for (int i = 2; i <= n; i++) {
		      a = m[1];
		      b = gcm;   
		      r = a % b;
		      while (r != 0) {
		    	  	r = a % b;       
		            a = b;
		            b = r;
		         }
		      gcm = b;
		      }
		  }
		}