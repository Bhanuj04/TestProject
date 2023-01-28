package interface_java;
import java.util.Scanner;

public class Shapearea implements Area,Area_curves{  //achieving mutiple inheritance
	@Override
	   public void Square() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter lenght of side");
		double s = kb.nextInt();
		double areasq = s*s;
		System.out.println(areasq);
		}
	
	@Override
	public void Circle() {
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		Shapearea geometry = new Shapearea();
		geometry.Square();
		geometry.Circle();
		
	}

}
