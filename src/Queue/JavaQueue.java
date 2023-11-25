package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
	public static void main(String[] args) {
Queue<Integer>queue1=new LinkedList<Integer>();
		
		queue1.add(1);
		queue1.add(3);
		queue1.add(5);
		queue1.add(6);
		queue1.add(2);
		System.out.println("Queue Content is="+queue1);
		//queue1.clear();
		System.out.println("First element is:" +queue1.element());
		System.out.println("First element is:" +queue1.peek());
		System.out.println("First element is:" +queue1.remove());
	    System.out.println("Remove First element is:" +queue1.poll());
		System.out.println("updated elements are:" +queue1);
	}

}
