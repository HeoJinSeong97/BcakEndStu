package day11;
class A{
	   int a; // �ν��Ͻ� ����: ��ü���� ���� ����xxx
	   static int b; // "��ü�� �����ϰ�"
	   // Ŭ���� ����: ��ü���� ���� �����ϴ� �����Ͱ���
	   static int[] arr = new int[10];
	   static int idx = 0;
	   A(){
	      this.a=100;
	      b=200;
	   }
	   void show() {
	      System.out.println(this.a+" / "+b);
	   }
	   void addNum(int num) {
		   if (idx < arr.length) {
			   arr[idx++] = num;			
		   }else {
			   System.out.println("����");
		   }
	   }
	}

	public class Test5 {

	   public static void main(String[] args) {
	      
	      A a1=new A();
	      A a2=new A();
//	      a1.a+=10;
//	      a2.b+=20;
//	      a1.show();
//	      a2.show();
	      a1.arr[a1.idx++] = 100;
	      
	      for (int i:a2.arr) {
			System.out.println(i);
		}
	      
	      
	   }

	}