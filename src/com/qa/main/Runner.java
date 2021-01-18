package com.qa.main;

public class Runner {
	public static void main(String[] arg) {
		//Person personNull = new Person();
		Person Jerry = new Person("Jerry", 18, "IT Intern");
		Person Jill = new Person("Jill", 30, "DevOPs Adviser");
		Person Amber = new Person("Amber", 23, "Lead Programmer");
		Person Gary = new Person("Gary", 19, "Receptionist");
	ListImplementation Staff = new ListImplementation();
	Staff.people.add(Amber);
	//Staff.people.add(personNull); - Java doesn't like null objects in collections
	Staff.people.add(Gary);
	Staff.people.add(Jill);
	Staff.people.add(Jerry);
	System.out.println(Staff.people);
	//Staff.findByName(null);
	System.out.println(Staff.findByName("Jeff Bridges"));
	System.out.println(Staff.findByName("Gary"));
	}

}
