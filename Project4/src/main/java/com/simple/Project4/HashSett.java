package com.simple.Project4;
import java.util.*;

public class HashSett {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<> ();
		
		//Set<Integer> set =new LinkedHashSet<> (); //order is maintained
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		
		System.out.println(set);   //random order
		
		set.remove(54);
		System.out.println(set);  
		
		System.out.println(set.contains(21));  //boolean true false value 
		
		System.out.println(set.isEmpty()); //true false 
		
		System.out.println(set.size());  //returns size
		
		set.clear();  //clears set
		System.out.println(set.size()); 
		
		
	}
	
	
	
	
	

}
