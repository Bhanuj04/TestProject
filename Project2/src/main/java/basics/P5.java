package basics;

class Employeee{
	int Salary;
	String Address;
	
	public void getInfo(int Salary,String Address) {
		this.Salary=Salary;
		this.Address=Address;
		
		
	}
	
	public void addSalary() {
		if((Salary)<5000) {
			Salary = Salary+50;
			System.out.println(Salary);
		}
	}
	
	
}
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee emp = new Employeee();
		emp.getInfo(200,"900Road");
		emp.addSalary();

	}

}
