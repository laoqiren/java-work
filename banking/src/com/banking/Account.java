package com.banking;

class Account {
	protected double balance;
	public Account(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
	public boolean deposit(double amt){
		this.balance += amt;
		System.out.println("Deposit "+amt+": true");
		return true;
	}
	public boolean widthdraw(double amt){
		if(this.balance>=amt){
			this.balance -= amt;
			System.out.println("Widthdraw "+amt+": true");
			return true;
		} else {
			System.out.println("Widthdraw "+amt+": false");
			return false;
		}
	}
}
