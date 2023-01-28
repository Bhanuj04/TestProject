package com.simple.Project3;

public class Conver2 {
	public static byte convStringToByte(String str) {
		return Byte.parseByte(str);
	}
	
	public static void main(String[] args) {
		
		String stringVal = "6";
		byte byteVal;
		byteVal = convStringToByte(stringVal);
		
		System.out.println(byteVal);
		
		String inputString = "Hello World!";
		byte[] byteArrray = inputString.getBytes();
		System.out.println(byteArrray);
		
		
	}

}
