package day11;

class Car{
	   int speed;
	   int maxSpeed;
	   String name;
	   Car(){
	      this("무명");
	   }
	   Car(String name){
	      this.name=name;
	      this.maxSpeed=120;
	      this.speed=0;
	   }
	   Car(int maxSpeed){
	      this("무명");
	      this.maxSpeed=maxSpeed;
	   }
	   void show() {
	      System.out.println(this.name+"님의 자동차 최대속도 "+this.maxSpeed+" / 현재속도 "+this.speed);
	   }
	   void speedUp() {
		   if (this.speed+10 >= this.maxSpeed) {
			System.out.println("속도증가불가");
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
		Car c2 = new Car("홍길동");
		Car c3 = new Car(200);
		c1.show();
		c2.show();
		c3.show();
		c1.speedUp();
		c1.show();
		
	}
}
