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
		System.out.println("�ȳ��ϼ���");
	}
}
class Teacher extends person{
	public Teacher() {
		super("����");
	}
	public Teacher(String name) {
		super(name);
	}
	String name;
	int num;
	void study() {
		hello();
		System.out.println("������");
	}
}
class student extends Teacher{
	public student(String name) {
		super(name);
	}

	public student() {
		super("����");
	}

	String name;
	int num;
	void study() {
		hello();
		System.out.println("������ �����մϴ�~");
	}
}

public class Test2 {
	public static void main(String[] args) {
		person p = new person("ȫ�浿");
		Teacher t = new Teacher();
		student s = new student();
		p.hello();
		t.study();
		s.study();
	}
}
