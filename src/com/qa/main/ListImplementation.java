package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
	List<Person> people = new ArrayList<>();
	public Person findByName(String name) {
		for (Person p : people) {
			if(p.getName().equals(name)) {
				return p;
			}	
			
		}
		//System.out.println("Person not found.");
		return null;
		
	}
	
	public void printAllNames() {
		for (Person p : people) {
			System.out.println(p.getName());
		}
	}
}

