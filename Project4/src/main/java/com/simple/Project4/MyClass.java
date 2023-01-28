
package com.simple.Project4;
import java.util.*;


public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc=new Scanner(System.in); 
	        int a= sc.nextInt(); 
	        int b= sc.nextInt();
	        HashMap<Integer, String> hm = new HashMap<Integer, String>();
	        hm.put(1,"a");
	        hm.put(2,"bc");
	        hm.put(3,"cde");
	        hm.put(4,"defg");
	        hm.put(5,"efghi");
	        hm.put(6,"fghijk");
	        hm.put(7,"ghijklm");
	        hm.put(8,"hijklmno");
	        hm.put(9,"ijklmnopq");
	        String str = "";
	        for(int i=a;i<=b;i++){
	            if(isPrime(i)){
	                int prime = rev(i);
	                int temp=prime%10;
	              
	                    str+=hm.get(temp);
	                    prime = prime/10;
	                }
	                System.out.println(i + "->" + str);
	                str = "";
	            }
	        }
	        
	    
	    
	    static boolean isPrime(int n){
	        if (n <= 1)
	            return false;
	  
	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	  
	        return true;
	    }
	    static int rev(int n){
	        int reverse = 0,rem;
	        while(n!=0){
	            rem = n%10;
	            reverse = reverse*10+rem;
	            n = n/10;
	        }
	        return reverse;
	    }
	

	}


