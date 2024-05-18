package examples;

public class Example_9 {

	public static void main(String[] args) {

		int number_1 = 7;
		int number_2 = 9;
		
		factorial(number_1);
		factorial(number_2);
	}

	// Calculate factorial of given number
	private static void factorial(int number) {

		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of " + number + " is : " + fact);
	}

}
