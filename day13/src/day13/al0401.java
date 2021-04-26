package day13;

import java.util.Arrays;
import java.util.Scanner;

public class al0401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int[] m = new int[3];

		for (int i = 0; i < m.length; i++) {
			System.out.print("정수 입력(0보다 크고 오름차순으로 입력한다.)");
			n = sc.nextInt();
			m[i] = n;
			System.out.println(i + "번째값 입력완료");
		}
		Arrays.sort(m);
		int gcm = m[0];
		int a, b, c; // 배열의 값을 넣고 변화를 일으킬 변수
		int r, k; // 나머지 값을 구하여 변화 요소를 정한다.
		for (int i = 2; i <= n; i++) {
//			나머지 계산을 위하여 a b c의 값을 내림차순으로 넣어준다.
			a = m[2];
			b = m[1];
			c = gcm;
//			기본적으로 무한반복이 이루어지고 만약 두 정수의 나머지값이 0이나온다면 탈출한다.
			while (true) {
				r = a % c;
				k = b % c;
				if (r == 0 && k == 0) {
//					두 정수의 나머지 값이 0이면 최대공약수
					gcm = c;
					break;
				} else {
//					a,b,c의 값을 내림차순으로 이동시킨다.
					if (r > k) {
						a = c;
						b = k;
						c = r;
					} else { // k값이 더 크므로 순서를 바꾼다.
						a = c;
						b = r;
						c = k;
					}
				}
			}
		}
		System.out.println("최대공약수 " + gcm);

	}
}
