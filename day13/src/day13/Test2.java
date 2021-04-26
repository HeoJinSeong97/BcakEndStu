package day13;

class person{
	String name;
	public person() {
		// TODO Auto-generated constructor stub
	}
	public person(String name) {
		// TODO Auto-generated constructor stub
		
	}
	void hello() {
		System.out.println("안녕하세요");
	}
}
class Teacher extends person{
	public Teacher() {
		super("무명");
	}
	public Teacher(String name) {
		super(name);
	}
	String name;
	int num;
	void study() {
		hello();
		System.out.println("공부중");
	}
}
class student extends Teacher{
	public student(String name) {
		super(name);
	}

	public student() {
		super("무명");
	}

	String name;
	int num;
	void study() {
		hello();
		System.out.println("수업을 시작합니다~");
	}
}

public class Test2 {
	public static void main(String[] args) {
		person p = new person("홍길동");
		Teacher t = new Teacher();
		student s = new student();
		p.hello();
		t.study();
		s.study();
	}
}
