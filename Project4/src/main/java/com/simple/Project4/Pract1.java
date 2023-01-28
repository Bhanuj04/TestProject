package com.simple.Project4;

class Studenttt {
	int rollno;
	String name;
	static String college="its";
	
	Studenttt(int r,String n) {
		rollno = r;
		name = n;
	}
	
	void display() {
		System.out.println(rollno + " " + name+" "+college );
	}
}



public class Pract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenttt s1 = new Studenttt(111,"bhanuj");
		Studenttt s2 = new Studenttt(112,"hgg");
		
		s1.display();
		s2.display();
		

	}

}
