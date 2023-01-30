package copy;
//class Vehicle1 {
//	
//	int j;
//	Vehicle1(int j) {
//		this.j=j;
//	}
//}
class Vehicle {
	
	int j;
	int k;
	
	Vehicle(int j) {
		this.j=j;
		
	}
}

class Car implements Cloneable {
	Vehicle v;
	int i;
	
	
	Car(Vehicle v,int i) {
		this.v=v;
		this.i=i;
	}
	
	public Object Clone() throws CloneNotSupportedException {
		Vehicle v1 = new Vehicle(v.j);
		Car d2 = new Car(v1,i);
		return d2;
	}
}
public class Deep {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle(20);  //j=20
		Car d1= new Car(v1,10);         //i=10
		System.out.println(d1.i + " " + d1.v.j);
		Car d2 = (Car)d1.Clone();
		d2.i = 500;
		d2.v.j = 400;
		System.out.println(d1.i + " " + d1.v.j);   //completely independent values
		
		System.out.println(d2.i + " " + d2.v.j);
		

		
		
		
		

	}

}
