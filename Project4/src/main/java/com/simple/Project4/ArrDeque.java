package com.simple.Project4;
import java.util.*;


public class ArrDeque {
	
	public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);   //added at first
        adq.offerLast(45);    //added at last
        adq.offer(26);

        System.out.println(adq);

      System.out.println(adq.peek());   //1st element
      System.out.println(adq.peekFirst());  //1st element 
      System.out.println(adq.peekLast());  //last element

        System.out.println(adq.poll());     //remove fist
        System.out.println("poll() " +adq);

       System.out.println(adq.pollFirst());    
        System.out.println("pollFirst() " +adq);

       System.out.println(adq.pollLast());      //remove last
        System.out.println("pollLast() " +adq); 

    }

}
