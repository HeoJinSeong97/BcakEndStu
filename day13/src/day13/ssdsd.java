package day13;

import java.util.Scanner;

public class ssdsd {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
		   int n = 0;
		    int[] m = new int[2];

		    for (int i = 0; i < m.length; i++) {
		       System.out.print("정수 입력(0보다 크고 오름차순으로 입력한다.)");
		       n = sc.nextInt();
		       m[i] = n;
		       System.out.println(i + "번째값 입력완료");
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