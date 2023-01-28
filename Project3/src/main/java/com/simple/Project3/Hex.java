package com.simple.Project3;

public class Hex {
	public static void main(String[] args) {
		
		String hexNumber = "121";
		int decimal = Integer.parseInt(hexNumber, 16);
		System.out.println("Hex value is " + decimal);
		
		System.out.println(Integer.toHexString(10));    //Integer to hexadeciaml
		System.out.println(Integer.toHexString(289)); 
		
		System.out.println(Long.toHexString(289));    //Long to hexadecimal
		
		
		char ch = 'a';
		int as_chi = ch;  
		System.out.println("ASCII value of is " + as_chi);  //ascii value of char a
		
		String alphabet = "abcd";

        for(int i=0;i<alphabet.length();i++){
        	char chh = alphabet.charAt(i);  //return character from index
        	System.out.println("ASCII value of is  " + (int)chh);  //casting to int
        }
	
		
		//decimal to hex byte to hex ascii to decimal
        //arr data 32 byte  
		
		
	
	}

}
