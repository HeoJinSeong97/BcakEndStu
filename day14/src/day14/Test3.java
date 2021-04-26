package day14;

class Animal{
	String name;
	public Animal(String string) {
		this.name = string;
	}
	void show() {
		System.out.println(this.name+"�Դϴ�.");
	}

	
}
class Dog extends Animal{
	String type;
	public Dog(String string) {
		super(string);
		this.type = string;
	}
	void show() {
		System.out.println("������ �̸��� "+this.type+"�Դϴ�.");
	}
	
}
class Cat extends Animal{
	String name;
	public Cat(String string) {
		super(string);
		this.name = string;
	}
	void show() {
		System.out.println("����� �̸��� "+this.name+"�Դϴ�.");
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0] = new Dog("���");
		a[1] = new Cat("����");
		a[2] = new Animal("�ڳ���");
		for (Animal animal : a) {
			animal.show();
			
		}
	}
}
