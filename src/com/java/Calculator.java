package com.java;

import java.util.Scanner;

public class Calculator {
 public static void main(String[] args) {
	 Scanner cal = new Scanner(System.in);
	 
	
	 System.out.println("enter the number is ab");
	 int ab= cal.nextInt();
	 System.out.println("enter the name is cd");
	int cd = cal.nextInt();
	int d=ab+cd;
	System.out.println("sum="+d);
	int g=ab-cd;
	System.out.println("sub="+g);

	int e=ab*cd;
	System.out.println("Multiple="+e);
	int f=ab/cd;
	System.out.println("Division="+f);
}

 
}
