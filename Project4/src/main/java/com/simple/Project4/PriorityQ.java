package com.simple.Project4;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
	public static void main(String[] args) {
		
		Queue<Integer> pq= new PriorityQueue<> ();  //min heap
		
 // Queue<Integer> pqq = new PriorityQueue<>(Comparator.reverseOrder()); //max heap
        

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
        
   
        
        
        
        

    }

}
