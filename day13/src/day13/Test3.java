package day13;
class Animal{
	String type;
	public Animal(String string) {
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println(this.type+"입니다.");
	}
}

class Dog extends Animal{
	public Dog() {
		super("강아지");
		this.type = "강아지";
	}
	void play() {
		System.out.println("~~~");
	}
}

class Cat extends Animal{

	public Cat(String string) {
		super(string);
		
	}
	void sleep() {
		System.out.println("zzzzzz");
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		Animal a1 = new Animal("코끼리");
		a1.show();
		Animal a2 = new Animal("하마");
		a2.show();
	}
}
