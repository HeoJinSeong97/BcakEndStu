package day17;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	void hello() {
		System.out.println("�ȳ� ���� "+this.name+"�̾�!");
	}
	void PrintScore() {
		System.out.println(this.name+"�л� "+this.score+"�Դϴ�.");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		LinkedList<Student> ss = new LinkedList<Student>();
		
		int ck;
		while(true) {
			System.out.println("�л������� ����...");
			System.out.println("1.����  2.���  3.����");
			System.out.print("�Է�: ");
			ck = sc.nextInt();
			if (ck == 1) {
				System.out.print("�л��̸��Է�: ");
				String str = sc.next();
				for (Student student : ss) {
					if (student.name.equals(str)) {
						System.out.println("������ �̸��� ��ü�� ������ �� �����ϴ�.");
						break;
					}					
				}
				ss.add(new Student(str, rd.nextInt(101)));
				Collections.sort(ss, new Comparator<Student>() {
					public int compare(Student o1, Student o2) {
						return (o1.score > o2.score) ? +1 : -1;
					};
				});
			}else if(ck == 2) {
				for (Student student : ss) {
					student.PrintScore();
				}
			}else if(ck == 3) {
				for (Student student : ss) {
					student.hello();
				}
				break;
			}
			

		}
		
	}
}
