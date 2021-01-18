package com.qa.main;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		ListImplementation pm = new ListImplementation();
		System.out.println("What would you like to do?");
		System.out.println("1. Add person");
		System.out.println("2. View all people");
		System.out.println("3. Search for specific person by name");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		String functionEntry = scan.nextLine();
		switch(functionEntry) {
			case "1":
				System.out.println("Enter name of new person");
				String name = scan.nextLine();
				System.out.println("Enter age");
				String inPutAge = scan.nextLine();
				int age = Integer.parseInt(inPutAge);
				System.out.println("Enter job title");
				String jobTitle= scan.nextLine();
			Person entry = new Person(name, age, jobTitle);
			pm.people.add(entry);
			break;
			case "2":
				pm.printAllNames();
				break;
			case "3":
				System.out.println("Enter name to search by");
				String nameFind = scan.nextLine();
				System.out.println(pm.findByName(nameFind));
				break;
			default: 
				System.out.println("Invalid Entry");
				break;
	}		scan.close();
}
}

