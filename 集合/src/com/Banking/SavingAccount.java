package com.Banking;

class SavingAccount extends Account{
	private double interest_rate;
	public SavingAccount(double balance,double interest_rate){
		super(balance);
		this.interest_rate = interest_rate;
	}
}
