package day14;
class Food{
	String menu;
	public Food(String string) {
		this.menu = string;
	}
	void f() {
		System.out.println("�޴��̸��� "+this.menu+"�Դϴ�.");
	}
}
class send extends Food{
	String menu;
	public send() {
		super("������ġ");
	}

}
class bagle extends Food{
	String menu;
	public bagle() {
		super("���̱�");
	}

}
class hamb extends Food{
	String menu;
	public hamb() {
		super("�ܹ���");
	}

}
class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	void eat(Food f) {
		f.f();
		System.out.println(this.name+"���� "+f.menu+"�� �Խ��ϴ�.");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Person p = new Person("����");
		p.eat(new bagle());
		p.eat(new hamb());
		p.eat(new send());
	}
}
