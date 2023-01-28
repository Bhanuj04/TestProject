package com.simple.Enums;



public class En2 {

	enum Seasons {WINTER(10),SPRING(20),SUMMER(25),FALL(5);
		
		public int value;    //constructor of enum is private compiler internally creates private constructor
		private Seasons(int value) {
			this.value = value;
		}
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		for(Seasons s:Seasons.values()) {
			System.out.println(s +" "+s.value);
		}
		
		//we cannot create instance of enum by new keyword as it contains private constructors only
			
			//value method returns an array that contains list of enumeration constatms

		}

}
