package com.banking;

public class CheckingAccount extends Account{
	private double overdraftProtection;
	public CheckingAccount(double balance){
		super(balance);
	}
	public CheckingAccount(double balance,double protect){
		super(balance);
		this.overdraftProtection = protect;
	}
	public boolean widthdraw(double amt){
		if(this.overdraftProtection > 0){
			if(this.overdraftProtection+this.balance>=amt){
				double milus = this.balance - amt;
				if(milus<0){
					this.balance = 0;
					this.overdraftProtection += milus;
					System.out.println("Widthdraw "+amt+": true");
					return true;
				} else {
					this.balance -= amt;
					System.out.println("Widthdraw "+amt+": true");
					return true;
				}
			} else {
				System.out.println("Widthdraw "+amt+": false");
				return false;
			}
		} else {
			if(this.balance>=amt){
				this.balance -= amt;
				System.out.println("Widthdraw "+amt+": true");
				return true;
			}
			else {
				System.out.println("Widthdraw "+amt+": false");
				return false;
			}
		}
	}
}
