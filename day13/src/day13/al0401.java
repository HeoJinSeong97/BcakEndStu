package day13;

import java.util.Arrays;
import java.util.Scanner;

public class al0401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int[] m = new int[3];

		for (int i = 0; i < m.length; i++) {
			System.out.print("���� �Է�(0���� ũ�� ������������ �Է��Ѵ�.)");
			n = sc.nextInt();
			m[i] = n;
			System.out.println(i + "��°�� �Է¿Ϸ�");
		}
		Arrays.sort(m);
		int gcm = m[0];
		int a, b, c; // �迭�� ���� �ְ� ��ȭ�� ����ų ����
		int r, k; // ������ ���� ���Ͽ� ��ȭ ��Ҹ� ���Ѵ�.
		for (int i = 2; i <= n; i++) {
//			������ ����� ���Ͽ� a b c�� ���� ������������ �־��ش�.
			a = m[2];
			b = m[1];
			c = gcm;
//			�⺻������ ���ѹݺ��� �̷������ ���� �� ������ ���������� 0�̳��´ٸ� Ż���Ѵ�.
			while (true) {
				r = a % c;
				k = b % c;
				if (r == 0 && k == 0) {
//					�� ������ ������ ���� 0�̸� �ִ�����
					gcm = c;
					break;
				} else {
//					a,b,c�� ���� ������������ �̵���Ų��.
					if (r > k) {
						a = c;
						b = k;
						c = r;
					} else { // k���� �� ũ�Ƿ� ������ �ٲ۴�.
						a = c;
						b = r;
						c = k;
					}
				}
			}
		}
		System.out.println("�ִ����� " + gcm);

	}
}
