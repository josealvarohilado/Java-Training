package basics;

public class NumbersCalc {
	
	public static void main (String[] args) {
		System.out.println("Program is starting");
		printName();
		
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		
		int product = multipleNumbers(numA, numB);
		System.out.println("The product of " + numA + " and " + numB + " is " + product);
	}

	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//This function will add two numbers
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multipleNumbers(int integerA, int integerB) {
		int product = integerA * integerB;
		addNumbers(product, product);
		return product;
	}
}
