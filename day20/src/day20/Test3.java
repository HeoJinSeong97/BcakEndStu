package day20;

class ATM implements Runnable{
	Account ac = new Account();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ac.outMoney();
	}
}

class Account{
	static int money = 10000;
	public synchronized void outMoney(){
		if (money>=3000) {
			money-=3000;
		}else {
			System.out.println(Thread.currentThread().getName()+"��ݺҰ���");
		}
		System.out.println("���� �ݾ�: "+money);
	}
}

public class Test3 {
	public static void main(String[] args) {
		ATM ac = new ATM();
		Thread t1 = new Thread(ac, "�����");
		Thread t2 = new Thread(ac, "�Ӳ���");
		Thread t3 = new Thread(ac, "ȫ�浿");
		Thread t4 = new Thread(ac, "�Ƽ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
