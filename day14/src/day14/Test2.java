package day14;
class A{
	int a;
	void f1() {
		System.out.println("Ȯ��1");
	}
	void f2() {
		System.out.println("Ȯ��2");
	}
}
class B extends A{
	int b;
	void f2() {
		System.out.println("�������̵�");
	}
	void f3() {
		System.out.println("Ȯ��3");
	}
}
public class Test2 {
	public static void main(String[] args) {
		A c1 = new A();
		B c2 = new B();
		c2.f2();//f2�� �������̵� �� B�� �޼ҵ��̴�.
		A c3 = new B();//��ĳ����
		c3.f1();//AŬ������ �޼ҵ常 ����� �� �ִ�.
		c3.f2();
//		B c4 = (B)new A();
		
	}
}
