package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("425636346", 1000);
		BankAccount acc2 = new BankAccount("515325636", 1000);
		BankAccount acc3 = new BankAccount("747211745", 1000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest{
	// Properties of bank account
	private static int iD = 1000;	// Internal ID
	private String accountNumber; 	// iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400412";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructors
	public BankAccount(String SSN, double initDeposit) {
		this.SSN = SSN;
		this.balance = initDeposit;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 1);
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void payBill(double amount) {
		balance -= amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance += amount;
		System.out.println("Making Depoist: " + balance);
		showBalance();
	}
	
	public String getRoutingNumber() {
		return routingNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void accruInterest() {
		
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: " + balance + "]";
	}
	
}