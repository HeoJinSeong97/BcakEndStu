package day12;

//접근제어자 == 접근지정자 ==접근자.
class B{
	int a;
	protected int b;
	private int c;
	public B() {
		// TODO Auto-generated constructor stub
		this.a=10;
		this.b=20;
		this.c=30;
	}
	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getC() {
		return c;
	}
	
	
}

public class Test3 {
	public static void main(String[] args) {
		B c1 = new B();
		
		c1.show();
//		c1.c=200; >> private로 접근할 수 없음
		c1.b = 200;
	}
}
