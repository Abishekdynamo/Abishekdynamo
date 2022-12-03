package com.java;

public class parent2 implements parent1 {


	public void cycle() {
		System.out.println("HERO");
		
	}
	public void ebike() {
		System.out.println("OLA");
	}
	
	public static void main(String[]args) {
		parent2 ab=new parent2();
		ab.cycle();
		ab.ebike();
	}
}
