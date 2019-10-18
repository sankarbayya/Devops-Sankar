package com.icici.loans.carloans;

public abstract class MyFirstAbstract {

	public static void main(String[] args) {
		
		MyFirstAbstract mf = new MyChildClassForAbstractClass();
		mf.m1();
		mf.m2();
		
	}		
		public void m1()
		{
			System.out.println("Iam method m1 in the class MyFirstAbstact class");
		}
		
		public abstract void m2();
		

	}


