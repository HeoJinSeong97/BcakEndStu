package day17;

import java.util.Scanner;

public class al0414 {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] comp1 = new int[5];
		int[] comp2 = new int[5];
//		2의 보수 1증가값
		int c = 1;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("A[" + i + "] :");
			a[i] = sc.nextInt();
			if (a[i] > 1 || a[i] < 0) {
				System.out.println("1과 0만 입력하시오.");
				i--;
				continue;
			}
//			만약 1이면 1을 빼서 0으로 만들어주고, 0이면 -1로 만들어 -1을 곱해 1로 바꿔준다.
			comp1[i] = (a[i] - 1) * (-1);
		}
		for (int i = 4; i >= 0; i--) {
			comp2[i] = comp1[i] + c;
//			만약 1이면 2를 나눠도 1이나오고 2라면 2를 나누면 나머지가 1이나온다.
			comp2[i] = comp2[i] % 2;
			c = comp1[i] * c;
		}
		System.out.print("1의보수: ");
		for (int i : comp1) {
			System.out.print(i);
		}
		System.out.println();
		System.out.print("2의보수: ");
		for (int i : comp2) {
			System.out.print(i);
		}

	}
}
