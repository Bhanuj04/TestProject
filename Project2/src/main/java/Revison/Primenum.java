package Revison;

class FindPrime{
	int num1;
	int num2;
	int i;
	int result;
	
	String[] arr = {"a","b","c","d","e","f","g","h","i","j","h","i","k","l","m",
			"n","o","p","q","r","s","t","u","v","x","y","z"};
	
	
	FindPrime(int a,int b) {
		this.num1 = a;
		this.num2 = b;
		
		for(i=a;i<=b;i++) {
			if(i==0 || i==1) {
				continue;
			}
			
			int flag=1;
			
			for(int j=2;j<=i;j++) {
				if(i%j == 0) {
					flag=0;
					break;
				}
				if(flag==1) {    //flag 1 prime
					result= i;
					
				System.out.println(result + " " +arr[result-1]);
					break;
					
					
					
					
					
				}
			}
		}
		
	}
	
//	void print() {
//		System.out.println("The number range is " +num1 + " " +num2);
//	//	System.out.println(i);
//		//System.out.println(result);
//		
//	}
//	
	
}

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FindPrime obj = new FindPrime(1,20);
		
		//obj.print();
		
		
		

	}

}
