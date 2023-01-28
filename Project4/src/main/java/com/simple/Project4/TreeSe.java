package com.simple.Project4;
import java.util.*;

public class TreeSe {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<> ();
		ts.add("Indore");
		ts.add("Dewas");
		ts.add("Ujjain");
		ts.add("Gwalior");
		
		System.out.println(ts);
		
		ts.remove("Dewas");
		System.out.println(ts);
		
		System.out.println("Iterating");
		Iterator<String> It = ts.iterator();
		while(It.hasNext()) {
			System.out.println(It.next());
		}
		
	}

}
