package day12;

import java.util.Random;
import java.util.Scanner;

class Stu {
	Random rd = new Random();
	String name;
	int[] score = new int[2];
	private char grade;

	public Stu(String name) {
		this.name = name;
		this.score[0] = rd.nextInt(100);
		this.score[1] = rd.nextInt(100);
		this.grade = (this.score[0] + this.score[1]) / 2 >= 50 ? 'P' : 'F';
	}

	public int getScore(int i) {
		return score[i];
	}

	public char getGrade() {
		return grade;
	}

}

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stuCnt;

		do {
			System.out.print("학생이 몇명입니까>>");
			stuCnt = sc.nextInt();
		} while (stuCnt < 1 || stuCnt > 10);

		Stu[] stu = new Stu[stuCnt];

		for (int i = 0; i < stuCnt; i++) {
			System.out.print("학생" + (i + 1) + " 이름: ");
			stu[i] = new Stu(sc.next());
		}
		for (int j = 0; j < stu.length; j++) {
			System.out.println(stu[j].name + "학생은 [" + stu[j].getGrade() + "] 입니다. 성적 : " + stu[j].getScore(j));
		}
	}
}
