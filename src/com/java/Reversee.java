package com.java;

public class Reversee {

public static void main(String[] args) {
		
		
		String str ="WeLcoMe to JAva SEleNium FRaMeWoRk";
		String upc = str.toUpperCase();
		String sc ="";
		for (int i = 0; i< str.length(); i++) {
			
			if(str.charAt(i)==upc.charAt(i)) {
				
				
				String tem = ""+str.charAt(i);
				
				
				
				
				sc = sc+tem.toLowerCase();
				
			}
                  else 
                  {
					String tem =""+str.charAt(i);
					sc=sc +tem.toUpperCase();
				}
			
				}
				
				System.out.println(sc);
				
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
