package day13;
class Calc{
	String name;
	int cnt;
	public Calc(String name) {
		this.name = name;
		this.cnt = 0;
	}
	void plus(int a, int b) {
		System.out.println(a+" + "+b+" = "+(a+b));
		this.cnt++;
	}
	void show() {
		System.out.println(this.name+"´ÔÀÇ °è»ê±â ÀÌ¿ë È½¼ö : "+cnt);
	}
}
class GongCalc extends Calc{

	public GongCalc(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	void power(int a, int b) {
		int p = a;
		for (int i = 1; i < b; i++) {
			p *= a;
		}
		System.out.println(a+"ÀÇ "+b+"½Â = "+p);
		this.cnt++;
	}
}

public class Test4 {
	public static void main(String[] args) {
		GongCalc g = new GongCalc("ÇãÁø¼º");
		g.power(2, 3);
		g.plus(10, 2);
		g.show();
	}
}
