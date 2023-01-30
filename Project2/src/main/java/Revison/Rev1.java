package Revison;
class Student {
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

public class Rev1 {
	
	static {                       //3 static block   //executed only once when class is loaded in memory by class loader
		System.out.println("Static block is executed");   //executed before main method at time of class loading
	}
 
	public static void main(String[] args) {
	
		
		
		
		StudentTest s1 = new StudentTest(100,"Bhanuj");
		StudentTest s2 = new StudentTest(200,"Ram");
		//Student.college = "DPS";
		StudentTest.change();             
		s1.display();
		s2.display();
		

	}

}
