package day20;


class Th1 extends Thread{
   public void run() {//ThreadŬ������ ������ �޼��� - �������̵�
      
      for(int i=1;i<=10;i++) {
         System.out.println("Ŭ������ �޴� ������ "+ i);
      }
      
   }
}

class Th2 implements Runnable{ //��

   @Override
   public void run() {
      // TODO Auto-generated method stub
      for(int i=1;i<=10;i++) {
         System.out.println("�������̽��� ���� ������ "+ i);
      }
   
   
   }}
public class Test1 {
   public static void main(String[] args) {
      
      Th1 t1=new Th1();
      t1.start();//�ش� �����尡 ���� run()�� �����Ű�� �޼��� 
      
      Th2 t2=new Th2();
      Thread t3=new Thread(t2); //Thread Ŭ������ ���� ��ü �������� ���ڷ� ���
      t3.start();
      
      //[������.Thread]
      
      //��� == �������� �۾��� �����ϴ� '�ϲ�'
      //�� == ���ø����̼� == sw == ���α׷�
      
      //���μ��� 
      //���α׷� -> ����Ŭ�� -> cpu.�޸�(��.�ڿ�)�� �Ҵ���� -> ���μ���(������)
      //�޸𸮸� �Ҵ���� ���μ����ȿ��� �������� �۾��� �����ϴ� �� == ������
      
      //��Ƽ������ -> �������� �۾��� �ϴ� �Ͱ� ���� ȿ��!
      //�ϳ��� ������ == �ϳ��� �۾�
      
      //���μ����� ����Ǵ� ���
      // 1. ������ ���: �켱���� ������ ����
      //-> �켱������ ���� ���α׷��� ����ǱⰡ �ſ� ����� ��Ȳ -> ��ƹ߻�
      // (2. �ð�����ó�� ���: ���� ������ ����)
      //3. �ð����ҹ��: �پ��ϰ� �����Ҽ��ְԵ�!
      
      //������ �ۼ����
      //1. Thread Ŭ���� ���
      //2. Runnable �������̽� implements // ��������...ó���ؾ��� �޼��尡 ����... << Interface
      
      //�켱����
      //������ ū ���ڰ� ���� ����
      t1.setPriority(1);
      t3.setPriority(10);
   }

}