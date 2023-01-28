package com.simple.Project3;
import java.lang.Integer;

public class Convers {
	public static void main(String[] args) {
		
		Integer a = new Integer(34);
		byte b = a.byteValue(); //converting int to byte value
		
		 System.out.println(b);
		 
		 Byte h = new Byte("01");   //Created a byte object
		 Byte bp = h.byteValue();   //converted byte to primitive byte
		 System.out.println("Byte object : " + bp);
	}

}
