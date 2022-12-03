package com.java;

public class Manager extends Employer {
	
    //--- single inheritance
	
	private void empid() {
		System.out.println("12345");
		
	}
	private void database() {
		System.out.println("emp details");
		
	}
	public static void main (String[]args) {
		Manager a = new Manager();
	a.Name();
	a.DOB();
	a.empid();
	a.database();

	}
}
