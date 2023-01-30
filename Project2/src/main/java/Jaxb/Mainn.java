package Jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
class Un{
	void ums() {
		// TODO Auto-generated method stub
		try {
		JAXBContext jc =JAXBContext.newInstance(new Class[] {Company.class, Customer.class,Address.class});
		Unmarshaller umss = jc.createUnmarshaller();
		
		Company Customer = (Company)umss.unmarshal(new File ("/home/bhanujarya/eclipse-workspace/Project2/src/main/java/Jaxb/customer.xml"));
		//Company Customer = (Company)umss.unmarshal(new File ("src/main/java\\Jaxb\\customer.xml"));
		System.out.println(Customer);
		
		
	
		

	}catch(JAXBException e) {
	//System.out.println(""+e.getMessage());
		System.out.println(e);
	}
	}
}
public class Mainn {

	public static void main(String[] args) {
	Un obj =new Un();
	obj.ums();
}
}
