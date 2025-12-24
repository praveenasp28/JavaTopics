package com.inheritance.single;

public class B extends A {

	private void empName() {

		System.out.println("Praveen");
		System.out.println("Balaji");
		System.out.println("Vishnu");
		

	}

	public static void main(String[] args) {
		B b = new B();
		b.empName();
		
		A a = new A();
		a.courseName();
		
		

	}

}
