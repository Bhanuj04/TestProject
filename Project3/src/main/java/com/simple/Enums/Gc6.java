package com.simple.Enums;

public class Gc6 {
	public void finalize(){System.out.println("object is garbage collected");}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(4);
		i=null;   //unreachable object as there is no reference to i
		
		Gc6 obj = new Gc6();
		Gc6 obj2 = new Gc6();
		
		obj = null;
		obj2 = null;
		
		System.gc();

	}

}
