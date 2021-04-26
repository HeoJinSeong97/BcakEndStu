package day12;
// 객체배열
class A{
	int a, b;
	void show() {
		System.out.println(a+" / "+b);
	}
}
public class Test1 {
	public static void main(String[] args) {

		int i = 3;
//		>>>
		A[] data = new A[3];
//		new = 객체화를 해준다, 인스턴스화를 해준다.
		for (int j = 0; j < data.length; j++) {
			data[j] = new A();
			data[j].a = 10+j;
			data[j].b = 20+j;
		}
		for (A a : data) {
			a.show();
		}
	}
}
