package Revison;                      //Multiple 

interface printable {
	void print();
}

 interface showaable {
	void show();
	void print();
}
 
 

public class Revv12 implements printable,showaable {
	
	 public void print() {
		 System.out.println("Print the code");
	 }
	 public void show() {
		 System.out.println("Show the code");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Revv12 obj = new Revv12();
		obj.print();
		obj.show();
		obj.print();
		
		

	}

}
