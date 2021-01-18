package com.qa.main;

public class Person {
	public Person() { };
	private String name;
	private int age;
	private String jobTitle;
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob_title() {
		return jobTitle;
	}
	public void setJob_title(String job_title) {
		this.jobTitle = job_title;
	}
	@Override
	public String toString() {
		return "Person [name=" + name +", age=" + age + ", job_title=" + jobTitle + "]";
	}
}
