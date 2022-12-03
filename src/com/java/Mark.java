package com.java;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Did you attend  exam");
		String exam =sc.nextLine();
	
		if (exam.equalsIgnoreCase("Yes") || exam.equalsIgnoreCase("Y")) {
	
			
		System.out.println("enter your mark");{
		int grade = sc.nextInt();
		
		
		if(grade>=75 && grade<=100) {
			System.out.println("First grade");
		} else if(grade>=40 && grade<=74){
			System.out.println("second grade");
		} else if (grade>0 && grade<=39) {
			System.out.println("Not cleard");
		}
	else {
		 
			System.out.println("you have not eligibal for exam");
		
sc.close();
	
}
		}
		}
	}
}