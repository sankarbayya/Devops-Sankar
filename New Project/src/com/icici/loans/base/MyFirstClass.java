package com.icici.loans.base;

public class MyFirstClass {

	
	int a=10, b=11, c;
	public static void main(String[] args) {
		System.out.println("Hi");
		
		MyFirstClass firstobject = new MyFirstClass();
				
		firstobject.add();
		firstobject.sub();
		
		
	}
	
	public void add()
	{
		
		c=a+b;
		System.out.println("addition of a and b is" + c);
	}

	public void sub()
	{
		
		c=a-b;
		System.out.println("subtraction of a and b is" + c);
	}
}
