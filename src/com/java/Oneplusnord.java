package com.java;

public class Oneplusnord  extends Oneplus{

	@Override
	public void Splitscreen() {
		System.out.println("games");
	    System.out.println("hotstar");
		super.Splitscreen();
	}
	
	@Override
	public void security() {
		System.out.println("fingerprint");
		System.out.println("facelock");
		super.security();
	}  



	

  public static void main(String[] args)  {
	  
	  Oneplusnord a = new Oneplusnord();
	  a.Splitscreen();
	  a.security();

  }

}