package com.simple.Project4;



public class GarbColl {
	
	public static void main(String[] args) {
		
		
		
		
		
		GarbColl s1 = new GarbColl();
		GarbColl s2 = new GarbColl();
		s1 = null;
		s2 = null;
		System.gc(); 
		
		
		
		
	}

}
