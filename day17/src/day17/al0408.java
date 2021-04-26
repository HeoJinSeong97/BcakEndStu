package day17;

import java.util.Scanner;

public class al0408 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] x = new int[10];
//		int[] y = new int[10];
		int[] x = {0,0,1,1,0,0,1,0,0,1};
		int[] y = {0,0,0,1,1,1,0,1,1,0};
//		System.out.println("x는 y보다 크다는 전제조건을 가짐");
//		System.out.println("x값 입력(1과 0만입력)");
//		for (int i = 0; i < x.length; i++) {
//			x[i] = sc.nextInt();
//		}
//		System.out.println("y값 입력(1과 0만입력)");
//		for (int i = 0; i < y.length; i++) {
//			y[i] = sc.nextInt();
//		}
		
		int[] a = new int[10];

		int z = 0;	//각 비트 단위별 뺄셈 결과
		int j = 9;	//인덱스 변수
		int b = 0;	//자리내림수

		do {
			z = x[j]-y[j]-b;
			if (z < 0) {
				b = 1;
				a[j] = 2+z;
			}else {
				b = 0;
				a[j] = z;
			}
			j--;
		}while(j>0);
		
		System.out.print("x : ");
		for (int i : x) {
			System.out.print(i);
		}
		System.out.print("\ny : ");
		for (int i : y) {
			System.out.print(i);
		}
		System.out.println();
		System.out.print("답 : ");
		for (int i : a) {
			System.out.print(i);
		}
		
	}
}
