package day14;
class Player{
	String user;
	Player(String user) {
		this.user = user;
	}
	void play(Ch c) {
		c.show();
		c.game();
	}
}
class Ch{
	String name;
	public Ch(String name) {
		this.name = name;
	}
	void show() {
		System.out.println("������ ĳ������ �̸��� "+this.name+"�Դϴ�.");
	}
	void game() {
		System.out.println("���ӽ�ų");
	}
}
class Am extends Ch{
	String name;
	public Am() {
		super("�ƹ���");
	}
	void game() {
		System.out.println("����!!");
	}
}
class Tm extends Ch{
	String name;
	public Tm() {
		super("Ƽ��");
	}
	void game() {
		System.out.println("������ġ...");
	}
}
public class Test4 {
	public static void main(String[] args) {
		Player p = new Player("����");
		
		Am c = new Am();
		p.play(c);
//		or
		p.play(new Tm());
	}
}
