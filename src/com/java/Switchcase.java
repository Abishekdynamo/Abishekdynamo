package com.java;

import java.util.Scanner;

public class Switchcase {
	
	
	
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
	
		
		 String value=sc.nextLine();
		switch(value) {
		
		
		case  "Withdrawal":
			System.out.println("Enter your name:");
			
			System.out.println("Do you want recepit");
			break;
			
		case"Mini Statement":
		System.out.println("Your last five Transaction is");
		break;
		
		
		case "check balance":
		System.out.println("your balance is");
		
		
		case"deposit":
			System.out.println("place your money");
			
		default:
			System.out.println("please insert your card again");
			break;
	
		  
			
		
		}
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
