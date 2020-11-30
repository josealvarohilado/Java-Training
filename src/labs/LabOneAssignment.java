package labs;

public class LabOneAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println("Sum of Numbers for " + n + ": " + sumOfNumbers(n));
		System.out.println("Factorial of " + n + ": " + factorial(n));
		
		double[] arr = {4,3,5,7,2,10};
		System.out.println("Minimum number in array is " + arrayFunction(arr, "min"));
		System.out.println("Maximum number in array is " + arrayFunction(arr, "max"));
		System.out.println("Average of array is " + arrayFunction(arr, "ave"));
	}

	// Sum of Numbers
	public static int sumOfNumbers(int n) { 
		 int sumOfNumbers = 0; 
		 for (int i = 1;i <= n; i++) {
			 sumOfNumbers += i; 
		} 
		return sumOfNumbers; 
	}
	
	// Factorial
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return (n * factorial (n-1));
	}
	
	// Array Function - Minimum, Maximum, Average
	public static double arrayFunction(double[] arr, String type) {
		double returnNumber = 0.0;
		switch(type) {
		case "min":
			double min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			returnNumber = min;
			break;
		case "max":
			double max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			returnNumber = max;
			break;
		case "ave": 
			double sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			double ave = sum / arr.length; 
			returnNumber = ave;
			break;
		}
		
		return returnNumber;
	}
}
