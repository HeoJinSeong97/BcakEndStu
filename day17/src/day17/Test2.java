package day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test2 {
	public static void main(String[] args) {
		Stack s = new Stack(); //Vector : 배열기반.
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.peek();
		System.out.println(s);
		
		Queue q = new LinkedList();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q);
		
		
	}
}
