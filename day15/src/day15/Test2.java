package day15;

abstract class Ch{
	String name;
	Ch(String name){
		this.name = name;
	}// ������ �ۼ� �����ϸ�, �ڽ�Ŭ�����鿡�� ������ �ش�.
	abstract void show();
}
class Am extends Ch{
	public Am(String name) {
		super(name);
	}
	@Override
	void show() {
		System.out.println("ammm");
		
	}
}
class Tm extends Ch{
	public Tm(String name) {
		super(name);
	}
	@Override
	void show() {
		System.out.println("tmmm");
		
	}
}

public class Test2 {
	public static void main(String[] args) {
		
	}
}
