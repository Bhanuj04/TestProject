package com.simple.Enums;

enum Color {
	RED,
	GREEN,
	YELLOW;
	
	
	public void colorInfo()  //Constructor with concrete method
    {
        System.out.println("Printing value from methood");
    }
}

public class En4 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color arr[] = Color.values();   
		
		for(Color col:arr) {
			System.out.println(col + " " +col.ordinal());  //tells us position in declaration
		}
		
		System.out.println(Color.valueOf("RED"));
		
		//value of method converts any non String variable or object such as int to
		//newly created String object
		
		Color c1 = Color.RED;
		c1.values();
		System.out.println(c1);
		

	}

}
