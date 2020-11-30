package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account
		BankAccount acc1 = new BankAccount();
		
		// acc1.name = "Roger Hue";
		// Encapsulation
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("1235123");
		System.out.println(acc1.getSsn());
		
		acc1.accountNumber = "01124235";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(5000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism thorugh overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "01124236";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01124237";
		
		/*
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
	}

}
