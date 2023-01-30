package basics;
class Rectangle{
	double length;
	double breadth;
	
	double area() {
		return length*breadth;
	}
	
	double perimeter() {
		return 2*(length+ breadth);
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle rect = new Rectangle(50,20);
//		rect.length= 5;
//	   rect.breadth = 10;
//		
//		rect.perimeter();
		
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		
	}

}
