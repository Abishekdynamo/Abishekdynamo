package com.java;

public class Reversestring1 {

	public static void main(String[] args) {
		
		String word ="ABISHEK";
		String bword ="";
		for (int i = word.length()-1; i>0; i--) {
			word = bword+word.charAt(i);
			
			
		}
		System.out.println("ABISHEK");
		
		
		
	}
	
	
	
}
