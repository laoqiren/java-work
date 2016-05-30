package com.banking;

public class TestomgBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating the customer Jane_Smith");
		System.out.println("Creating her savings account with a"
				+ "500.00balance and 3% interest");
		SavingAccount Jane_Smith = new SavingAccount(500,0.03);
		
		System.out.println("Creating the customer Owen_Bryant");
		System.out.println("Creating his checking account with a"
				+ "500.00balance and no overdraft protection");
		CheckingAccount Owen_Bryant = new CheckingAccount(500,0);
		
		System.out.println("Creating the customer Tim_Soley");
		System.out.println("Creating his checking account with a"
				+ "500.00balance and 500 protection");
		CheckingAccount Tim_Soley = new CheckingAccount(500,500);
		
		System.out.println("Creating the customer Maria_Soley");
		System.out.println("Maria shares her checking account "
				+ "her husband Tim");
		CheckingAccount Maria_Soley = Tim_Soley;
		
		System.out.println("\nRetrieving the customer Jane_Smith"
				+ "with her savings account");
		Jane_Smith.widthdraw(150);
		Jane_Smith.deposit(22.5);
		Jane_Smith.widthdraw(47.62);
		Jane_Smith.widthdraw(400);
		System.out.println("Customers[Smith,Jane]has a balance of"
				+ Jane_Smith.getBalance());
		
		System.out.println("\nRetrieving the customer Owen_Bryant"
				+ "with his checking account that has overdraft"
				+ "protection");
		Owen_Bryant.widthdraw(150);
		Owen_Bryant.deposit(22.5);
		Owen_Bryant.widthdraw(47.62);
		Owen_Bryant.widthdraw(400);
		System.out.println("Customers[Bryant,Owen]has a balance of"
				+ Owen_Bryant.getBalance());
		
		System.out.println("\nRetrieving the customer Tim_Soley"
				+ "with his checking account that has overdraft"
				+ "protection");
		Tim_Soley.widthdraw(150);
		Tim_Soley.deposit(22.5);
		Tim_Soley.widthdraw(47.62);
		Tim_Soley.widthdraw(400);
		System.out.println("Customers[Soley,Tim]has a balance of"
				+ Tim_Soley.getBalance());
		
		System.out.println("\nRetrieving the customer Maria_Soley"
				+ "with her joint checking account with her husband");
		Maria_Soley.deposit(150);
		Maria_Soley.widthdraw(750);
		System.out.println("Customers[Soley,Maria]has a balance of"
				+ Maria_Soley.getBalance());
	}

}
