package com.inheritance.single;

public class B extends A {

	private void empName() {

		System.out.println("Praveen");

	}

	public static void main(String[] args) {
		B b = new B();
		b.empName();
		
		A a = new A();
		a.courseName();
		
		

	}

}
