package com.tka.constructor;

public class p1_Employee {

	String name;
	float salary;
	int age;

//	Zero Parameterized Constructor

	p1_Employee() {

	}

//	Parameterized Constructor
	p1_Employee(String n, float s, int a) {
		name = n;
		salary = s;
		age = a;

	}


	@Override
	public String toString() {
		return "p1_Employee [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	

}
