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
		System.out.println("안녕 나는 "+this.name+"이야!");
	}
	void PrintScore() {
		System.out.println(this.name+"학생 "+this.score+"입니다.");
	}
}

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		LinkedList<Student> ss = new LinkedList<Student>();
		
		int ck;
		while(true) {
			System.out.println("학생정보를 저장...");
			System.out.println("1.저장  2.출력  3.종료");
			System.out.print("입력: ");
			ck = sc.nextInt();
			if (ck == 1) {
				System.out.print("학생이름입력: ");
				String str = sc.next();
				for (Student student : ss) {
					if (student.name.equals(str)) {
						System.out.println("동일한 이름의 객체를 생성할 수 없습니다.");
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
