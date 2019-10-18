package com.icici.loans.carloans;

public class MyChildClassForAbstractClass extends MyFirstAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChildClassForAbstractClass Ch = new MyChildClassForAbstractClass();
		Ch.m1();
		Ch.m2();
	}

	
	
	/*
	 * public void m1() {
	 * System.out.println("Iam overriddenmethod m1 in the child class"); }
	 */
	
	
	@Override
	public void m2() 
	
	{
		System.out.println("iam m2 method from child class");
		
	}

}
