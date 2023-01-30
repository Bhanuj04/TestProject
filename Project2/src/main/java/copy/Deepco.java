package copy;

class Student implements Cloneable{
	
	int id;
	String name;
	
	public Student(int id,String name)   {
		this.id=id;
		this.name=name;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

class Department implements Cloneable{
	String Id;
	String grade;
	String designation;
	Student sst;
	
	public Department(String Id,String grade,String designation,Student sst) {
		this.Id=Id;
		this.grade = grade;
		this.designation=designation;
		this.sst = sst;
	}

protected Object clone() throws CloneNotSupportedException {
	Department dep = (Department) super.clone();
	dep.sst = (Student) sst.clone();
	return dep;
}
}
class Employee implements Cloneable{
	int id;
	String name;
	Department dept;   //reference variable
	
	public Employee(int id,String name,Department dept) {
		this.id = id;
		this.name=name;
		this.dept=dept;
	}
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();  //creating clone object of emp
		emp.dept = (Department) dept.clone();  //cloning old contained object
		return emp;
	}
}



public class Deepco {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		Student st = new Student(1,"Gaurav");
		Department dept1=new Department("1","A","Assistent",st);
		Department dept2=null;
		
		dept2 = (Department)dept1.clone();
		System.out.println(dept1.sst.id);
		dept2.sst.id = 90;
		System.out.println(dept2.sst.id);
		
		Employee emp1 = new Employee(25,"Jay",dept1); //an object having 2 primitive variable and one reference variable
		Employee emp2 = null;
		
		emp2 = (Employee)emp1.clone();
		
		System.out.println(emp1.dept.designation);
		System.out.println(emp1.dept.grade);
		
		emp2.dept.designation = "Manager";   //on updating the value in clonned object is not affecting the original object
		
		System.out.println(emp2.dept.designation);
		System.out.println(emp1.dept.designation);
		
		
		
		
		

	}

}
