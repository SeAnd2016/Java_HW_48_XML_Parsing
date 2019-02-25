package core;

import java.io.File;

import javax.xml.bind.*;

public class Employees {

		public static void main(String[] args) throws Exception {
			
			File xml = new File("./employee.xml");
			JAXBContext jaxbC = JAXBContext.newInstance(EmployeesType.class);
			Unmarshaller jaxbU = jaxbC.createUnmarshaller();
			
			EmployeesType element = (EmployeesType) jaxbU.unmarshal(xml);
				String id = element.employee.id;
				String first_name = element.employee.name.first;
				String last_name = element.employee.name.last;
			
			System.out.println(id + first_name + last_name);
		}
}