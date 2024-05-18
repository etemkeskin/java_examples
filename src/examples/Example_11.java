package examples;

public class Example_11 {

	public static void main(String[] args) {
		int[] array = { 7, 9, 12, 4, 16, 8, 11, 13, 6, 5 };
		int secondMax = secondLargestNumberInArray(array);
		System.out.println("Second largest number is : " + secondMax);

	}

	// Finding second largest number in an array
	public static int secondLargestNumberInArray(int[] array) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] > secondMax && array[i] != max) {
				secondMax = array[i];
			}
		}
		return secondMax;
	}

}
