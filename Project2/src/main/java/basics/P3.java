package basics;

import java.util.Scanner;

class Area{
	double Length;
	double Breadth;
	public Area(double length, double breadth) {
		super();
		Length = length;
		Breadth = breadth;
	}
	
	public double returnArea(){
		System.out.println(Length*Breadth);
		return Length*Breadth;
	}
}
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		double l,b;
		l=s.nextInt();
		b = s.nextInt();
		
		Area obj = new Area(l,b);
		obj.returnArea();
		
		
	}

}
