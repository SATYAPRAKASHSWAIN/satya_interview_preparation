package collections;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue<String>q=new PriorityQueue<>();
		q.offer("Tusar");
		q.offer("Rocky");
		q.offer("Sangram");
		System.out.println(q);//[Rocky, Tusar, Sangram]
		System.out.println(q.peek());//Rocky
		System.out.println(q.element());//Rocky
		System.out.println(q.poll());//Rocky
		System.out.println(q);//[Tusar,Sangram]
		System.out.println(q.remove());//Tusar
		System.out.println(q);//[Sangram]
		
	}

}
