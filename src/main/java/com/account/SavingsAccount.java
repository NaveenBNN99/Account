package com.account;

public class SavingsAccount extends Account{

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calInterest() {
		// TODO Auto-generated method stub
		float si;
		si= (bal*4*1)/100;
		System.out.println("Simple Interest"+si);
	}

}
