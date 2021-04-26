package day15;

class tv implements usetv{
	int vol =0;
	boolean power;
	public tv() {
		this.power = true;
	}
	@Override
	public void power() {
		if (power) {
			System.out.println("OFF");			
		}else {
			System.out.println("ON");			
		}
		
	}
	@Override
	public void volDown(int vol) {
		// TODO Auto-generated method stub
		this.vol = this.vol-vol < min? 0 : this.vol-vol;
		System.out.println("ÇöÀçº¼·ý : "+this.vol);
	}
	@Override
	public void volUp(int vol) {
		this.vol = this.vol+vol > max? 100 : this.vol+vol;
		System.out.println("ÇöÀçº¼·ý : "+this.vol);
	}
}
interface usetv{
	int min=0,max=100;
	void power();
	void volUp(int vol);
	void volDown(int vol);
	
}
public class Test5 {
	public static void main(String[] args) {
		tv t = new tv();
		t.volUp(30);
		t.volDown(10);
		t.volDown(40);
	}
}
