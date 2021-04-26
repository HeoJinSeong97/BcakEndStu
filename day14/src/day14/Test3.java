package day14;

class Animal{
	String name;
	public Animal(String string) {
		this.name = string;
	}
	void show() {
		System.out.println(this.name+"입니다.");
	}

	
}
class Dog extends Animal{
	String type;
	public Dog(String string) {
		super(string);
		this.type = string;
	}
	void show() {
		System.out.println("강아지 이름은 "+this.type+"입니다.");
	}
	
}
class Cat extends Animal{
	String name;
	public Cat(String string) {
		super(string);
		this.name = string;
	}
	void show() {
		System.out.println("고양이 이름은 "+this.name+"입니다.");
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0] = new Dog("요요");
		a[1] = new Cat("나비");
		a[2] = new Animal("코끼리");
		for (Animal animal : a) {
			animal.show();
			
		}
	}
}
