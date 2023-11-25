package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	public static void main(String[] args) {
		    PriorityQueue<Integer>pq = new PriorityQueue<>();
			pq.add(14);
			pq.add(7);
			pq.add(50);
			pq.add(30);
			pq.add(12);
			pq.add(65);
			pq.add(156);
			pq.add(45);
			pq.add(23);
			System.out.println("Priority Queue Content:" +pq);
			System.out.println("Priority Queue Content:" +pq.peek());
			System.out.println("Priority Queue Content : " + pq);
		     // System.out.println("Priority Queue Content : " + pq.poll());
		     // System.out.println("Priority Queue Content : " + pq);
			Iterator<Integer>iterator = pq.iterator();
			while(iterator.hasNext()) {
				System.out.println(pq.poll()+"");
			}
			
		}

		@Override
		public String toString() {
			return "PriorityQueueClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		
	}

}
