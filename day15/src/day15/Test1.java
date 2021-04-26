package day15;

abstract class Shape{
	String name;
	abstract void draw();
	
}

class Circle extends Shape{
	String name;
	void draw() {
		System.out.println("");
	}
}
class Rect extends Shape{
	String name;
	void draw() {
		System.out.println("");
	}
}
class Star extends Shape{
	String name;
	void draw() {
		System.out.println("");
	}
}
class Tri extends Shape{
	@Override
	void draw() {
		
	}
}

public class Test1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
	}
}
