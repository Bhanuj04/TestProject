package com.simple.Project4;
import java.util.LinkedList;
import java.util.Queue;

public class Linkedd {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<> ();
		queue.offer(12);    //offer methhod to add elements
	  queue.offer(24);
	     queue.offer(36);

	    System.out.println(queue);

	    System.out.println(queue.poll());   //to remove elements

	    System.out.println(queue);

	   System.out.println(queue.peek());    //topmost element
	    
	   // queue.add(12);   //same as offer but throws exception if task fails
	   //queue.remove();    //poll
	   //queue.element();      //peek
	}

}
