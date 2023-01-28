package com.simple.Project4;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l"
				,"m","n","o","p","q","u","r","s","t","u","v","w","x","y","z"};
		int i=0;
		int n=i;
		
		int lower = 1, upper = 20;
		//int ans = i;

	     for ( i = lower; i <= upper; i++)
	       if (isPrime (i)) {
	    	 //  for(int ans=0;ans<str.length;ans++) 
	        System.out.println (i +str[i-1] );
	        
	        for(int b=i;b<n;b++) {
	        	System.out.println(str[b]);
	        }
	       
//	        for(int b=i;b<4;b++) {
//	        	System.out.println (str[b] );
//	        }
	        
	        
	        
	        
	        
//	        for(int j=i-2;j>=0;j--) {
//	        	for(int k=i;k<8;k++) {
//	        		System.out.println(str[k]);
//	        	}
//	        	//System.out.println(str[i]);
//	        }
	        
	        
	        
	    // int ans = i;
	   //  System.out.println (str[ans]);
	      
	       }
//	     for(int j=i-1;j>=0;j--) {
//	        	System.out.println(i);
//	        }
	     
	    
	     
	     
	   }

	   static boolean isPrime (int n)
	   {
	     //int count = 0;

	     // 0, 1 negative numbers are not prime
	     if (n < 2)
	       return false;

	     // checking the number of divisors b/w 1 and the number n-1
	     for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }

	     // if reached here then must be true
	     return true;
	   }

	}


