package com.java;

public class Railway1 extends Railway{

   

public void ticket(){
	System.out.println("confirm");
	
	super.ticket();
	
}  

public void confirmation(){
	 System.out.println("chennai to madurai");
	 	System.out.println("madurai to chennai");
	 	
	 	super.Confirmation();
}
 public static void main(String[] args) {
	 Railway1 A = new Railway1();
	A.confirmation(); 
	 
 }

{

}
}