package com.java;

public class Reversestring {
	
	public static void main(String[] args) {
		
		String str = "Welcome to Greens java selenium framework",nstr=" ";
		char ch;
		System.out.print("original word:");
		 System.out.println("Welcome to Greens java selenium framework");
		 for (int i = 0; i < str.length(); i++) {
			 ch=str.charAt(i);
		nstr=ch+nstr;
			 
			
		}
		System.out.println("Reversed word:"+nstr);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
