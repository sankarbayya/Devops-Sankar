package com.icici.loans.carloans;

public interface Rbi
{

	public void withdrawal();
	public void deposit();
	
	
			public static void main(String[] args)
			
			{
		Rbi r;
		
		r = new ICICI();
		r. deposit();
		r.withdrawal();
		
		r = new HDFC();
		r.deposit();
		r.withdrawal();
		
		}
	
}
