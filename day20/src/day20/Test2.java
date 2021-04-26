package day20;

class TIsys implements Runnable{
	Ticket t = new Ticket();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.buy();
	}
	
}

class Ticket{
	static int ticket=2;
	
	public synchronized void buy() {
		if (ticket>0) {
			System.out.println( Thread.currentThread().getName()+"님 발급!");
			ticket--;
		}else {
			System.out.println("티켓이 없습니다.");
		}
		System.out.println("남은 티켓 수 : "+ticket);
	}
	
}

public class Test2 {
	public static void main(String[] args) {
		TIsys ts = new TIsys();
		Thread t1 = new Thread(ts, "홍길동");
		Thread t2 = new Thread(ts);
		Thread t3 = new Thread(ts);

		t1.start();
		t3.start();
		t2.start();
		
	}
}
