package com.simple.DOM;

public class Student {
	int rollno;
	String name;
	static String college = "Itc";    //static variable 1
	
	Student(int r,String n) {
		this.rollno = r;
		this.name = n;
	}
	static void change() {    //static method 2
		college = "ips";
	}
	
	void display() {
		System.out.println(rollno + " " + name+ " "+college);
	}
}
