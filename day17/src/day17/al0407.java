package day17;

import java.util.Scanner;

public class al0407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b;		//�Է°�
		int r = 1;		//������������
		int l;			//�ּҰ����
		int high, low;	//ū��/������
		
		do {
			System.out.print("�����Է� a:");
			a = sc.nextInt();
			System.out.print("�����Է� b:");
			b = sc.nextInt();
			if(a<=0||b<=0)System.out.println("Error! 0�̻��� ���� �Է����ּ���.");
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
		System.out.println(a+"�� "+b+"�� �ּҰ���� : "+l+" �ִ�����: "+high);
	}
}
