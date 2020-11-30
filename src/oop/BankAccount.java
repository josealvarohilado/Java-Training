package oop;

public class BankAccount implements IRate{
	// Define variables
	
	// Static variables
	// static >> belongs to the class and not the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "509812";
	
	// instance variables
	String accountNumber;
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	/* Constructor definitions
	 * 1. Used to define, setup, initialized properties of an object
	 * 2. Constructors are IMPICITLY called upon instantiation
	 * 3. The same name as the class itself
	 * 4. Constructors have no return type
	 */
	
	BankAccount(){
		System.out.println("New account created");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New account created: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account created: " + accountType);
		System.out.println("Initial deposit of " + initDeposit);
		if (initDeposit < 1000) {
			String errorMsg = "ERROR: Minimum deposit must be $1,000";
			System.out.println(errorMsg);
		}
		
		balance = balance + initDeposit;
	}
	
	// Getters / Setters
	
	// Allow user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	// Define methods
	public void deposit(double amount) {
		balance += amount;
		showActivitiy("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance -= amount;
		showActivitiy("WITHDRAW");
	}
	
	private void showActivitiy(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance is: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ Name: " + name + ", Account Number: " + accountNumber + ", Routing Number: #" + routingNumber + ", Balance: $" + balance + " ]";
	}
}
