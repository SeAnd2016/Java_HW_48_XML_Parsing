package core;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "employees")

public class EmployeesType {

	@XmlElement(name = "employee") protected Level2 employee;
	static class Level2 {
		@XmlAttribute(name = "id") String id;
		@XmlElement(name = "name") protected Level3 name;}
	static class Level3 {
		@XmlElement(name = "first") String first;
		@XmlElement(name = "last") String last;
	}
}
