package day11;

class Car{
	   int speed;
	   int maxSpeed;
	   String name;
	   Car(){
	      this("����");
	   }
	   Car(String name){
	      this.name=name;
	      this.maxSpeed=120;
	      this.speed=0;
	   }
	   Car(int maxSpeed){
	      this("����");
	      this.maxSpeed=maxSpeed;
	   }
	   void show() {
	      System.out.println(this.name+"���� �ڵ��� �ִ�ӵ� "+this.maxSpeed+" / ����ӵ� "+this.speed);
	   }
	   void speedUp() {
		   if (this.speed+10 >= this.maxSpeed) {
			System.out.println("�ӵ������Ұ�");
			return;
		   }
		   this.speed += 10;
	   }
	   void speedUp(int speed) {
		   this.speed += speed;
	   }
	   void speedDown() {
		   if(this.maxSpeed - 10 < 0){this.speed = 0;}
		   this.speed -= 10;
	   }
	   void speedDown(int speed) {
		   if(this.maxSpeed - speed < 0) {this.speed = 0;}
		   this.speed -= speed;
	   }
	   
	}
	

public class Test2 {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("ȫ�浿");
		Car c3 = new Car(200);
		c1.show();
		c2.show();
		c3.show();
		c1.speedUp();
		c1.show();
		
	}
}
