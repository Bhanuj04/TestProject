package basics;

class Employee{
	
	public String name;
	public int Year;
	public int Salaray;
	public String Address;
	
	Employee(String name,int Year,int Salary,String Address) {
		this.name=name;
		this.Year=Year;
		this.Salaray=Salary;
		this.Address=Address;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Year=" + Year + ", Salaray=" + Salaray + ", Address=" + Address + "]";
	}
	
	
}

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("ram",2001,100,"900 Airen");
		Employee emp1 = new Employee("shyam",2010,300,"C21");
		System.out.println(emp);
		System.out.println(emp1);
		
	}

}
