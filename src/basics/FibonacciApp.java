package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the previous fibonnaci numbers
		int fibLength = 10;
		int[] fibonnaci = new int[fibLength];
		for (int x = 0; x < fibLength; x++) {
			int valueOne = x - 1;
			int valueTwo = x - 2;
			
			if (x == 0) {
				fibonnaci[x] = x;
			} 
			else if (x == 1) {
				fibonnaci[x] = x;
			}
			else {
				fibonnaci[x] = fibonnaci[valueOne] + fibonnaci[valueTwo];
			}
			System.out.println(fibonnaci[x]);
		}
		
		System.out.println("\nFibonnaci using recurssion:");
		System.out.println(fib(7));
	}
	
	public static int fib(int n) {
		if (n == 0 ) {
			return 0;
		} 
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
