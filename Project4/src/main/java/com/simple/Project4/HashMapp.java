package com.simple.Project4;
import java.util.*;

public class HashMapp {
	 public static void main(String[] args) {

	        Map<String, Integer> numbers = new HashMap<>();
	        // Map<String,Integer> numbers = new LinkedHasMap<> (); //order is maintained

	        numbers.put("One", 1);      //add value
	        numbers.put("Two", 2);
	        numbers.put("Three", 3);
	        numbers.put("Four", 4);
	        numbers.put("Five", 5);


	        numbers.remove("Three");  //remove value

     // if(!numbers.containsKey("Two")) {
     //    numbers.put("Two", 23);
    // }

       numbers.putIfAbsent("Two", 23);     //adds checkpoint if absent then only we add
	        System.out.println(numbers);
	        System.out.println(numbers.containsValue(3));  //returns boolean true/false

	        System.out.println(numbers.isEmpty());

        for (Map.Entry<String, Integer> e: numbers.entrySet()) {  //Entry class to iterate
            System.out.println(e);
	
            System.out.println(e.getKey());    //fetch keys
	            System.out.println(e.getValue());   //fetch value
	        } 
	
        for (String key: numbers.keySet()) {               //iterate over key
	            System.out.println(key);
	        }
	
      for(Integer value: numbers.values()) {          //iterate over values
            System.out.println(value);
        }

	    }

}
