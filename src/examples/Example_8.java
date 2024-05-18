package examples;

public class Example_8 {

	public static void main(String[] args) {

		int number_1 = 88;
		int number_2 = 25;
		int number_3 = 89;

		isPrimeNumber(number_1);
		isPrimeNumber(number_2);
		isPrimeNumber(number_3);
	}

	// Is number Prime number
	public static void isPrimeNumber(int number) {

		boolean isPrime = true;
		// Corner case
		if (number <= 1)
			isPrime = false;

		// Check from 2 to sqrt(n)
		if (number > 1) {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}
}
