package day14;
class Food{
	String menu;
	public Food(String string) {
		this.menu = string;
	}
	void f() {
		System.out.println("메뉴이름은 "+this.menu+"입니다.");
	}
}
class send extends Food{
	String menu;
	public send() {
		super("샌드위치");
	}

}
class bagle extends Food{
	String menu;
	public bagle() {
		super("베이글");
	}

}
class hamb extends Food{
	String menu;
	public hamb() {
		super("햄버거");
	}

}
class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	void eat(Food f) {
		f.f();
		System.out.println(this.name+"님이 "+f.menu+"를 먹습니다.");
	}
}

public class Test5 {
	public static void main(String[] args) {
		Person p = new Person("진성");
		p.eat(new bagle());
		p.eat(new hamb());
		p.eat(new send());
	}
}
