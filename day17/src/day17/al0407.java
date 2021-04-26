package day17;

import java.util.Scanner;

public class al0407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b;		//입력값
		int r = 1;		//나머지값저장
		int l;			//최소공배수
		int high, low;	//큰값/작은값
		
		do {
			System.out.print("정수입력 a:");
			a = sc.nextInt();
			System.out.print("정수입력 b:");
			b = sc.nextInt();
			if(a<=0||b<=0)System.out.println("Error! 0이상의 값을 입력해주세요.");
		}while(a<=0||b<=0);
		if (a>b) {
			high = a;
			low = b;
		}else {
			high = b;
			low = a;
		}
		while(r>0) {
			r = high%low;
			high = low;
			low = r;
		}

		l = (a*b)/high;
		System.out.println(a+"와 "+b+"의 최소공배수 : "+l+" 최대공배수: "+high);
	}
}
