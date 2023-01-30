package Revison;         //method overloading
class Adder {
	static int show(int a,int b) {
		return a+b;
	}
	
	static void show(int a,int b,float c) {  //automatic type promotion
		System.out.println(a+b+c);
	}
}
public class Rev5 {

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
     System.out.println(Adder.show(6, 42));
     Adder.show(3, 5, 8);
		
		
	}

}
