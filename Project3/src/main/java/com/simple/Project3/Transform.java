package com.simple.Project3;

public class Transform {
	public static void main(String[] args) {
		//String to int
		String s="200";  
		//Convert using Integer.parseInt()  
		int i=Integer.parseInt(s);  
		System.out.println(i);  
		//int to string
		int j=200;  
		String t=String.valueOf(j);  
		System.out.println(j);
		System.out.println(t+100);// + is string concatenation operator 
		
		
		//converting int to byte value
		Integer a = new Integer(34);
		byte b = a.byteValue(); 
		
		 System.out.println(b);
		 
		 String inputString = "Hello World!";  //String to bytes
			byte[] byteArrray = inputString.getBytes();
			System.out.println(byteArrray);
		 
		 String hexNumber = "121";
			int decimal = Integer.parseInt(hexNumber, 16);
			System.out.println("Hex value is " + decimal);
			
			System.out.println(Integer.toHexString(10));    //Integer to hexadeciaml
			System.out.println(Integer.toHexString(289)); 
			
			System.out.println(Long.toHexString(289));    //Long to hexadecimal
			
			String hex="a";                    //hexadecimal to decimal
			int decimall=Integer.parseInt(hex,16);  
			System.out.println(decimall);  
			
			String binaryString="1010";  
			int decimalll=Integer.parseInt(binaryString,2);    //binary to  decimal
			System.out.println(decimalll);  
			System.out.println(Integer.toBinaryString(10)); //decimal to binary
			
			
			char ch = 'a';             //char to ascii value
			int as_chi = ch;  
			System.out.println("ASCII value of is " + as_chi);  //ascii value of char a
			
			String alphabet = "abcd";

	        for(int k=0;k<alphabet.length();k++){
	        	char chh = alphabet.charAt(k);  //return character from index
	        	System.out.println("ASCII value of is  " + (int)chh);  //casting to int
	        }
		
		
		
		
		
	}

}
