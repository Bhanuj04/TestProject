package Revison;

abstract class Shape {
	abstract void draw();
	
	void Pen(){                          //non abstract method
		System.out.println("Pen is used to draw shapes");
	}
}

class Rectanglee extends Shape {
	
	void draw() {
		System.out.println("Drawing recatngle");
		
	}
	
}

class Circlee extends Shape {
	void draw() {
		System.out.println("Drawing circle");                                                                                            
	}
}

public class Rev9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectanglee s = new Rectanglee();
		s.draw();
		s.Pen();
		
		Circlee c = new Circlee();
		c.draw();
		c.Pen();

	}

}
