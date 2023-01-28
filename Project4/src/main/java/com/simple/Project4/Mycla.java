package com.simple.Project4;
import java.util.*;

public class Mycla {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in); 
	        int a= sc.nextInt(); 
	        int b= sc.nextInt();
	        
	        HashMap<Integer,String> hm = new HashMap<Integer,String>();
	        
	        hm.put(1, "a");
	        hm.put(2,"bc");
	        hm.put(3,"cde");
	        hm.put(4,"defg");
	        hm.put(5,"efghi");
	        hm.put(6,"fghijk");
	        hm.put(7,"ghijklm");
	        hm.put(8,"hijklmno");
	        hm.put(9,"ijklmnopq");
	        
	        String str = "";
	        for(int i=a;i<=b;i++) {
	        	if(isPrime(i)) {
	        		int prime = rev(i);
	        		
	        		while(prime!=0) {
	        		int temp = prime%10;
	        		
	        		
	        		str += hm.get(temp);
	        		prime = prime/10;
	        	}
	        	System.out.println(i + "->" + str);
                str = "";
	        }
	        }
		
	}
		// TODO Auto-generated method stub
		 static boolean isPrime(int n) {
			
			
			if(n<=1)  
				return false;
			
			for(int i=2;i<n;i++) {
				if(n%i==0) 
					return false;
			}
			
					return true;
				
			}
		 
		 static int rev(int n) {
			 int reve=0,rem;
			 
			 
			 while(n!=0) {
				 rem = n%10;
				 reve =reve*10+rem;
				 
				 n=n/10;
				 
			 }
			 return reve;
		 }
		
		

	}


	
	
