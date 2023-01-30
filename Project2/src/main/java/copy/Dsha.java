package copy;

class Alpha {
	int j;
	
	Alpha(int j) {
		this.j=j;
	}
	
}

class Beta implements Cloneable {
	int i;   //primitive variable
	Alpha a;   //reference variable
	
	Beta(int i,Alpha a) {
		this.i=i;
		this.a=a;
	}
	
	public Object Clone() throws CloneNotSupportedException {
		
//		Ga
//		Alpha a1 = new Alpha(a.j);
//		Beta b = new Beta(i,a1);
//		return b;
		
		
		return super.clone();
	}
}
public class Dsha {
	public static void main(String[] args) throws CloneNotSupportedException  {

	Alpha a = new Alpha(10);
	
	Beta b1 = new Beta(50,a);
	System.out.println(b1.i + " "+ b1.a.j);
	
	Beta b2 = (Beta)b1.Clone();
	b2.i = 900;
	b2.a.j = 700;
	System.out.println(b1.i + " "+ b1.a.j);   //value of primitive variable independent but reference are updates
	Object b3=new Beta(500,a);
	Beta b4=(Beta)b3;
	
}
}