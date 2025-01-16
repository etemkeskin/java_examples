package examples;

import java.util.Arrays;
import java.util.Random;

// SELECTION SORT Example
public class Example_18 {

	public static void main(String[] args) {
		int[] numbers = new int[20];
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100000);
		}
		
		long startTime = System.currentTimeMillis();
		System.out.println(Arrays.toString(numbers));
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
		long endTime = System.currentTimeMillis();
		System.out.println("Took " + (endTime - startTime) + "ms");
	}

	private static void selectionSort(int[] numbers) {
		int length = numbers.length;
		
		for (int i = 0; i < numbers.length-1; i++) {
			int min = numbers[i];
			int indexOfMin = i ;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < min ) {
					min = numbers[j];
					indexOfMin = j;
				}
			}
			swap(numbers, i, indexOfMin);
		}
		
	}

	private static void swap(int[] numbers, int a, int b) {
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}

}
