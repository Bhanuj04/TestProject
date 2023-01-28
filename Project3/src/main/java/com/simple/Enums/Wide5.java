package com.simple.Enums;

public class Wide5 {
	
	public void con() {
		
			//byte->short->char->int ->long-> float->double
		
				int x=7;
				//There is an automatic conversion from integer to long type
				long y =x;
				//from long to float
				float z=y;
				
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wide5 obj = new Wide5();
		obj.con();
	
	}

}
