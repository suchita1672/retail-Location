package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {
	public static void main(String[] args) {
		
		Deque<Integer>dq = new ArrayDeque<>();
		dq.add(3);
		dq.addLast(4);
		dq.addFirst(2);
		dq.offerFirst(1);
		System.out.println("Deque Content:" +dq);
		dq.addFirst(10);
		dq.addLast(20); 
		System.out.println("Updated Deque Content:" +dq);
		System.out.println("First element remove:" +dq.removeFirst());
		System.out.println("Deque Content:" +dq);
		System.out.println("Last element removed :" +dq.pollLast());
		System.out.println("Deque Content:" +dq);
		System.out.println("first element:" +dq.peekFirst());
		System.out.println("last element:" +dq.peekLast());
		System.out.println("first element get:" +dq.getFirst());
	}

}
