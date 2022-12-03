package com.java;

public class Const extends Constructor1{
	
	
	public Const() {
		this(50);
		System.out.println("login");
	}
	public Const(int b) {
		this("incorrect");
		System.out.println("password"+b);
	}
	public Const(String submit) {
		this(96,"valasaravakkam");
		
		System.out.println("name");
		
	}
	public Const(int a,String homepage) {
		super();
		System.out.println(a+homepage);
		
		
		
		
	}
	
	public static void main(String[]args) {
		Const a = new Const();
	}
	
	
	
	
	
	

}
