package day14;
class A{
	int a;
	void f1() {
		System.out.println("확인1");
	}
	void f2() {
		System.out.println("확인2");
	}
}
class B extends A{
	int b;
	void f2() {
		System.out.println("오버라이딩");
	}
	void f3() {
		System.out.println("확인3");
	}
}
public class Test2 {
	public static void main(String[] args) {
		A c1 = new A();
		B c2 = new B();
		c2.f2();//f2는 오버라이딩 된 B의 메소드이다.
		A c3 = new B();//업캐스팅
		c3.f1();//A클래스의 메소드만 사용할 수 있다.
		c3.f2();
//		B c4 = (B)new A();
		
	}
}
