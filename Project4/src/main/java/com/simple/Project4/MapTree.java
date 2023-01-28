package com.simple.Project4;
import java.util.*;


public class MapTree {
	public static void main(String[] args) {
		Map<String,Integer> map = new TreeMap<> ();
		
		map.put("Bhanuj", 10);
		map.put("Arya", 20);
		map.put("Medicaps", 60);
		map.put("University", 80);
		
		map.remove("Arya");
		
		for(Map.Entry<String,Integer> e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue()) ;
	
			
		}
		
		  System.out.println(map);
	      System.out.println(map.containsValue(60));  //returns boolean true/false

	      
	      map.clear();
	      System.out.println(map.isEmpty());
	      
	      
		
		
	}
	

}
