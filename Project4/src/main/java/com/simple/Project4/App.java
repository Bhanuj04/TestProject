package com.simple.Project4;


enum Color {
	RED,
	GREEN,
	BLUE
}
public class App 
{
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Color arr[] = Color.values();
    	
    	for(Color col:arr) {
    		System.out.println(col + " "+ col.ordinal() );
    	}
    	
    	System.out.println("Value of" + Color.valueOf("RED"));
    	
    }
}

