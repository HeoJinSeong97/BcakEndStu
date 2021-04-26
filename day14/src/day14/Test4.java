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
		System.out.println("선택한 캐릭터의 이름은 "+this.name+"입니다.");
	}
	void game() {
		System.out.println("게임스킬");
	}
}
class Am extends Ch{
	String name;
	public Am() {
		super("아무무");
	}
	void game() {
		System.out.println("정지!!");
	}
}
class Tm extends Ch{
	String name;
	public Tm() {
		super("티모");
	}
	void game() {
		System.out.println("버섯설치...");
	}
}
public class Test4 {
	public static void main(String[] args) {
		Player p = new Player("진성");
		
		Am c = new Am();
		p.play(c);
//		or
		p.play(new Tm());
	}
}
