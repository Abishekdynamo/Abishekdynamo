package com.java;

public class Over_loading {
	public void shopname() {
		System.out.println("Himalaya super market");
	}

	public void shopname(int Rice,String name){
		 System.out.println("BILL NO:"+Rice+"\n"+"Product:"+name);
	}

	 public void shopname(String name1,String name2,String name3) {
		 System.out.println("Varieties 1:"+name1+"\n"+"Varieties 2:"+name2+"\n"+"Varieties 3:"+name3);
	 }
	 
public static void main(String[] args) {
	Over_loading ab = new Over_loading();
	ab.shopname();
	ab.shopname(1010,"RICE");
	ab.shopname("Basmati","Bamboo","Brown Basmati");
	
}
	
	
}

