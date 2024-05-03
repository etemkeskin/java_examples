package examples;

public class Example_2 {

	// Swap two numbers without using a third variable
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("a is " + a + " and b is " + b);
		
		// 30 = 10 +20
		a = a + b;
		// 10 = 30 - 20
		b = a - b;
		//20  = 30 -10 
		a = a - b;

	    System.out.println("After swapping, a is " + a + " and b is " + b);

	}

}
