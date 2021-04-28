package webDay3;

public class Student {
	
	private int num;
	private String name;
	private int score;
	
	public Student(String name, int num, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
