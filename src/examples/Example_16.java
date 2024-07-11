package examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Find Duplicate Elements in an Array
public class Example_16 {

	public static void main(String[] args) {
		Integer[] myArray = { 2, 3, 7, 9, 21, 3, 7, 12, 78, 12, 11, 3 };

		Set<Integer> result = findDuplicateInArray(myArray);
		System.out.println(result);

		Set<?> result_2 = findDuplicateInArrayWithStream(myArray);
		System.out.println(result_2);
	}

	// Using for Loop for Duplicate Detection
	public static Set<Integer> findDuplicateInArray(Integer[] array) {
		Set<Integer> duplicates = new HashSet<>();
		Set<Integer> seenIntegers = new HashSet<>();

		for (int val : array) {
			if (!seenIntegers.add(val)) {
				duplicates.add(val);
			}
		}
		return duplicates;
	}

	// Using Streams and Collectors for Duplicate Detection
	public static <T> Set<T> findDuplicateInArrayWithStream(T[] array) {
		Set<T> seen = new HashSet<>();
		return Arrays.stream(array).filter(val -> !seen.add(val)).collect(Collectors.toSet());
	}
}
