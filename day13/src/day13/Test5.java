package day13;

class Shape{
   Shape(String name){
      this.name=name;
   }
   double area;
   String name;
   void draw() {
      System.out.println(this.name+" 그림을 그립니다...");
   }
   double getArea() {
      System.out.println("부모의 getArea()");
      return this.area;
   }
}
// "함수명 재정의"★★★★★
// : 오버로딩 -> 인자의 개수,자료형이 다를때만!
// : 오버라이딩 -> 인자의 개수,자료형 같을때, "상속"관계라면!
class Circle extends Shape{
   Circle(int radius){
      super("원");
      this.radius=radius;
   }
   int radius;
   static final double PI=3.14; // 상수화
   void draw() {
      System.out.println("빙글빙글빙글빙글빙글빙글");
   }
   double getArea() { // 오버라이딩
      System.out.println("자식의 getArea()");
      this.area=this.radius*this.radius*PI;
      return this.area;
   }
   
}
class rect extends Shape{
	int a;
	int b;
	rect(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public rect(int i, int j) {
		super("네모");
		this.a = i;
		this.b = j;
	}
	void draw() {
		System.out.println("네모 그림을 그립니다.");
	}
	double getArea() {
		System.out.println("rect의 getArea()");
	      this.area=this.a*this.b;
	      return this.area;
	}
	
}
public class Test5{
	public static void main(String[] args) {
		Shape s = new Shape("하트");
		s.draw();
		rect r = new rect(10, 20);
		r.draw();
		System.out.println((int)r.getArea());
	}
}