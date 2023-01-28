package com.simple.Project4;
import java.util.*;

public class ArrayListt {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();  //empty array created
		
		list.add(10);   //internal array of size 10 created
		list.add(20);//add method to add values
		list.add(30);
		list.add(40);
		System.out.println(list);   //elements always added at end of list
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		
		list.add(1,80);     //we can define where to add
		
		System.out.println(list);
		
		List<Integer> newlist = new ArrayList();
		newlist.add(200);
		newlist.add(210);
		list.addAll(newlist);   //add entire list
		System.out.println(list);
		
		System.out.println(list.get(2));  //to get an element
		list.remove(3);                  //to remove an element
		System.out.println(list);
		//list.clear();               //remove entire list
		//System.out.println(list);
		
		list.set(4, 1000);            //set at particular position
		System.out.println(list); 
		
		System.out.println(list.contains(1000));   //returns boolean value
		
		//for(int i=0;i<list.size();i++) {
		//	System.out.println("Element is" + list.get(i));
		//}
		
		Iterator <Integer> it = list.iterator();
		while(it.hasNext()) {         //tells if iteartor has next element
			System.out.println("iterator " +it.next());  //access next value
		}
		
		
		
		
		
	}
	

}
