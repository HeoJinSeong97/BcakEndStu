package day13;
class Animal{
	String type;
	public Animal(String string) {
		// TODO Auto-generated constructor stub
	}
	void show() {
		System.out.println(this.type+"�Դϴ�.");
	}
}

class Dog extends Animal{
	public Dog() {
		super("������");
		this.type = "������";
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
		Animal a1 = new Animal("�ڳ���");
		a1.show();
		Animal a2 = new Animal("�ϸ�");
		a2.show();
	}
}
