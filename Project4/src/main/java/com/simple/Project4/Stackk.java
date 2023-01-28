package com.simple.Project4;
import java.util.Iterator;
import java.util.Stack;

public class Stackk {
	public static void main(String[] args) {
		 Stack<String> animals= new Stack<>();

	        animals.push("Lion");
	        animals.push("Dog");
	        animals.push("Horse");
	        animals.push("Cat");

	        System.out.println("Stack: " + animals);

	        System.out.println(animals.peek());

	        animals.pop();

	        System.out.println("Stack: " + animals);

	        System.out.println(animals.peek());
	        Iterator <String> it = animals.iterator();
	        while(it.hasNext()) {
	        	System.out.println(it.next());
	        }
	        
	}

}
