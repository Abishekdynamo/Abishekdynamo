package com.java;

public class Reverseword1 {
	
	public static void main(String[] args) {
		
		String s[]="Welcome to greens".split(" ");
		String s1 = "Welcome to greens";
		//System.out.println(s1.charAt(0));
		String ans="";
		//System.out.println(ans);
		for (int i = s.length-1;i>=0; i--) {
			ans +=s[i]+" ";	
			System.out.println(i + " -> " + ans);
		}
		/*ans +=s[2]+" ";
		ans +=s[1]+" ";
		ans +=s[0]+" ";*/
		
		String s2="greens to Welcome";
		//System.out.println(s2.charAt(0));
		//System.out.println("reversed String : "+ans);
	}
	
	
	
	
	
	

}
