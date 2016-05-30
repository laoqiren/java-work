package com.Banking;

import java.util.*;
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
		//System.out.println("Deposit "+amt+": true");
		return true;
	}
	public boolean widthdraw(double amt){
		if(this.balance>=amt){
			this.balance -= amt;
			//System.out.println("Widthdraw "+amt+": true");
			return true;
		} else {
			//System.out.println("Widthdraw "+amt+": false");
			return false;
		}
	}
	
}
class Customer {
	private String firstName;
	private String lastName;
	private List<Account> accounts;
	public Customer(String f,String l){
		this.firstName = f;
		this.lastName = l;
		this.accounts = new ArrayList<Account>();
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public Account getAccount(int index){
		return accounts.get(index);
	}
	public void setAccount(Account acct){
		accounts.add(acct);
	}
}
public class Bank {
	private List<Customer> customers;
	
	public void addCustomer(String f,String l){
		Customer item = new Customer(f,l);
		customers.add(item);
	}
	public int getNumOfCustomers(){
		return customers.size();
	}
	public Customer getCustomer(int index){
		return customers.get(index);
	}
	public Bank() {
		customers = new ArrayList<Customer>();
	}
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Simms");
		bank.addCustomer("Bryant", "Owen");
		bank.addCustomer("Tim", "Soley");
		bank.addCustomer("Maria", "Maria");
		bank.getCustomer(0).setAccount(new Account(500));
		bank.getCustomer(1).setAccount(new Account(200));
		bank.getCustomer(2).setAccount(new Account(1500));
		bank.getCustomer(3).setAccount(new Account(200));
		
		System.out.println("Customer:"+bank.getCustomer(0).getFirstName()+
				","+bank.getCustomer(0).getLastName());
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(0).getAccount(0).getBalance());
		bank.getCustomer(0).getAccount(0).widthdraw(300);
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(0).getAccount(0).getBalance());
		
		System.out.println("Customer:"+bank.getCustomer(1).getFirstName()+
				","+bank.getCustomer(1).getLastName());
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(1).getAccount(0).getBalance());
		
		System.out.println("Customer:"+bank.getCustomer(2).getFirstName()+
				","+bank.getCustomer(2).getLastName());
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(2).getAccount(0).getBalance());
		bank.getCustomer(2).getAccount(0).widthdraw(1300);
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(2).getAccount(0).getBalance());
		
		System.out.println("Customer:"+bank.getCustomer(3).getFirstName()+
				","+bank.getCustomer(3).getLastName());
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(3).getAccount(0).getBalance());
		bank.getCustomer(3).getAccount(0).widthdraw(50);
		System.out.println("     Saving Account:current balance is "+bank.getCustomer(3).getAccount(0).getBalance());
	}
}
