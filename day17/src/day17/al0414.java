package day17;

import java.util.Scanner;

public class al0414 {
	public static void main(String[] args) {
		int[] a = new int[5];
		int[] comp1 = new int[5];
		int[] comp2 = new int[5];
//		2�� ���� 1������
		int c = 1;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("A[" + i + "] :");
			a[i] = sc.nextInt();
			if (a[i] > 1 || a[i] < 0) {
				System.out.println("1�� 0�� �Է��Ͻÿ�.");
				i--;
				continue;
			}
//			���� 1�̸� 1�� ���� 0���� ������ְ�, 0�̸� -1�� ����� -1�� ���� 1�� �ٲ��ش�.
			comp1[i] = (a[i] - 1) * (-1);
		}
		for (int i = 4; i >= 0; i--) {
			comp2[i] = comp1[i] + c;
//			���� 1�̸� 2�� ������ 1�̳����� 2��� 2�� ������ �������� 1�̳��´�.
			comp2[i] = comp2[i] % 2;
			c = comp1[i] * c;
		}
		System.out.print("1�Ǻ���: ");
		for (int i : comp1) {
			System.out.print(i);
		}
		System.out.println();
		System.out.print("2�Ǻ���: ");
		for (int i : comp2) {
			System.out.print(i);
		}

	}
}
