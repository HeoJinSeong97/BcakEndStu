package day20;


class Th1 extends Thread{
   public void run() {//Thread클래스가 가지는 메서드 - 오버라이딩
      
      for(int i=1;i<=10;i++) {
         System.out.println("클래스로 받는 스레드 "+ i);
      }
      
   }
}

class Th2 implements Runnable{ //☆

   @Override
   public void run() {
      // TODO Auto-generated method stub
      for(int i=1;i<=10;i++) {
         System.out.println("인터페이스로 만든 스레드 "+ i);
      }
   
   
   }}
public class Test1 {
   public static void main(String[] args) {
      
      Th1 t1=new Th1();
      t1.start();//해당 스러드가 가진 run()을 수행시키는 메서드 
      
      Th2 t2=new Th2();
      Thread t3=new Thread(t2); //Thread 클래스로 만들 객체 생성자의 인자로 사용
      t3.start();
      
      //[스레드.Thread]
      
      //명령 == 실질적인 작업을 수행하는 '일꾼'
      //앱 == 어플리케이션 == sw == 프로그램
      
      //프로세스 
      //프로그램 -> 더블클릭 -> cpu.메모리(밥.자원)를 할당받음 -> 프로세스(실행중)
      //메모리를 할당받은 프로세스안에서 실질적인 작업을 수행하는 것 == 스레드
      
      //멀티스레드 -> 여러개의 작업을 하는 것과 같은 효과!
      //하나의 스레드 == 하나의 작업
      
      //프로세스가 실행되는 방식
      // 1. 선점형 방식: 우선순위 순서로 진행
      //-> 우선순위가 낮은 프로그램은 실행되기가 매우 어려운 상황 -> 기아발생
      // (2. 시간순서처리 방식: 실행 순서로 진행)
      //3. 시간분할방식: 다양하게 실행할수있게됨!
      
      //스레드 작성방법
      //1. Thread 클래스 상속
      //2. Runnable 인터페이스 implements // 스레드라면...처리해야할 메서드가 있음... << Interface
      
      //우선순위
      //가급적 큰 숫자가 먼저 실행
      t1.setPriority(1);
      t3.setPriority(10);
   }

}