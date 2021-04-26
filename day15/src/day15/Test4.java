package day15;
interface I1{
	void power();
	void call();
	void show();
}
interface I2{
	int min=0;
	int max=0;
	void volUp();
	void volDown();
}
class Phone implements I1,I2{
	@Override
	public void volDown() {}
	@Override
	public void volUp() {}
	@Override
	public void call() {}
	@Override
	public void power() {
		System.out.println("업데이트건....");
	}
	@Override
	public void show() {}
}
class Air implements I1{
	@Override
	public void call() {}
	@Override
	public void power() {
		System.out.println("온도...");
	}
	@Override
	public void show() {}
}

public class Test4 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.power();
		
		Air a = new Air();
		a.power();
	}
}
