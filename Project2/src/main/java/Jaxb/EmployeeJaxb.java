package Jaxb;
import javax.xml.bind.*;
import javax.xml.transform.Result;

import java.io.*;
public class EmployeeJaxb 
{
 
	

	public void marshal() {
		// TODO Auto-generated method stub
		try {
			 
			 Employee emp = new Employee("005","Bhanuj","Indore",100);
			 JAXBContext jc = JAXBContext.newInstance(Employee.class);
			 //it is an anonymous class 
			 //anonymous class is an inner class without a name and for which only single object is created
			 //Marshalling - Converting java objects to xml file
			 
			 Marshaller ms = jc.createMarshaller();
			 ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);   //Otherwise xml file comes in one line
			 ms.marshal(emp, System.out);  //display output
			//ms.marshal(emp,new FileWriter("src/main/java\\Jaxb\\Employee.xml"));  //creating xml file in specified address
			 ms.marshal(emp, new FileWriter("/home/bhanujarya/Downloads/xml_docs\\emp.xml"));
			 	 
		}catch(Exception e) {
			System.out.println("" + e.getMessage());
		}
		
	}
	
	public void unmarshal() {
		try {
			JAXBContext jc = JAXBContext.newInstance(Employee.class);
			Unmarshaller ums = jc.createUnmarshaller();
			Employee emp = (Employee)ums.unmarshal(new File("src/main/java\\Jaxb\\Employee.xml"));
			System.out.println("Display information");
			System.out.println("id " + emp.getId());
			System.out.println("name " + emp.getName());
			System.out.println("Address " + emp.getAddress());
			System.out.println("Salary " + emp.getSalary());
			
		}catch(Exception e) {
			System.out.println(""+e.getMessage());
		}
	}
	
	
	}

