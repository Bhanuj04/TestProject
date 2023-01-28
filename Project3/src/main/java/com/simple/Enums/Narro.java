package com.simple.Enums;

public class Narro {
	public void nar() {
		
double d=155.53;
		
		long l = (long)d;   //changing double to long
		
		int i =(int)l;    //long to int
		System.out.println(d);  
		System.out.println("Long " + l);
		System.out.println("Int " + i);
		
		int g=257;
		byte b = (byte)g;    //g%256
		System.out.println(b);
		
		double h = 345.77;
		byte k = (byte)h;    //k%256
		System.out.println(k);
		
		//char ch = 'c';
		//int num =88;  //char and num are compatible with each other
		
		//ch=num;
		
		float x =5.67f;
		byte y =42;
		int z = 50000;
		char a ='a';
		
		
		double result = (x*y) +(z/a);  //automatic type promotion
		System.out.println(result); 
		
		byte p =50;          
		p = (byte)(p*2);            // Type casting int to byte
		System.out.println(p);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Narro obj = new Narro();
obj.nar();

	}

}
