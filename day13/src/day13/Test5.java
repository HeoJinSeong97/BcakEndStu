package day13;

class Shape{
   Shape(String name){
      this.name=name;
   }
   double area;
   String name;
   void draw() {
      System.out.println(this.name+" �׸��� �׸��ϴ�...");
   }
   double getArea() {
      System.out.println("�θ��� getArea()");
      return this.area;
   }
}
// "�Լ��� ������"�ڡڡڡڡ�
// : �����ε� -> ������ ����,�ڷ����� �ٸ�����!
// : �������̵� -> ������ ����,�ڷ��� ������, "���"������!
class Circle extends Shape{
   Circle(int radius){
      super("��");
      this.radius=radius;
   }
   int radius;
   static final double PI=3.14; // ���ȭ
   void draw() {
      System.out.println("���ۺ��ۺ��ۺ��ۺ��ۺ���");
   }
   double getArea() { // �������̵�
      System.out.println("�ڽ��� getArea()");
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
		super("�׸�");
		this.a = i;
		this.b = j;
	}
	void draw() {
		System.out.println("�׸� �׸��� �׸��ϴ�.");
	}
	double getArea() {
		System.out.println("rect�� getArea()");
	      this.area=this.a*this.b;
	      return this.area;
	}
	
}
public class Test5{
	public static void main(String[] args) {
		Shape s = new Shape("��Ʈ");
		s.draw();
		rect r = new rect(10, 20);
		r.draw();
		System.out.println((int)r.getArea());
	}
}