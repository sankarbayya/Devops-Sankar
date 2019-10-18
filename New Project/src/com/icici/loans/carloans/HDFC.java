package com.icici.loans.carloans;

public class HDFC implements Rbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		h. withdrawal();
		h.deposit();
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		
		System.out.println("HDFC impemented class With drawal method");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("HDFC impemented class deposit method");
	}

}
