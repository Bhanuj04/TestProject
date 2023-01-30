package Revison;      //override

class shape {
	void draw() {
		System.out.println("Drwaing");
	}
}
class Rectangle extends shape {
	
	void draw() {  //subclass method overrides parent class method
		
		System.out.println("Drawing rectangle");
	}
}

class Circle extends shape {
	
	void draw() {
		System.out.println("Drawing circle at digivalet ");
	}
}

public class Rev4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		shape ss = new shape();
		ss.draw();
		shape s;
		s = new Rectangle();  
		s.draw();     
		
		s = new Circle();
		s.draw();
		
		

	}

}
