package com.java;

import java.util.Scanner;

public class Scannerdemo {
  public static void main(String[] args) {
	  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name:");
	
	String name = sc.nextLine();
	System.out.println("student name is "+name);
	
	System.out.println("Enter your address:");
	String address = sc.nextLine();
	System.out.println("Employee address: "+address);
	
	System.out.println("Employee your id: ");
	int id = sc.nextInt();
	System.out.println("employee id is "+id);
	
}
}
