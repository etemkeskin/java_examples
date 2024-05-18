package examples;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class example_10 {

	public static void main(String[] args) {
		
		Integer[] newArray = {7, 8, 12, 7, 6, 9, 5, 12 ,5 };
 		removeDuplicatesFromArray(newArray);

	}
	
	// remove duplicate elements from an Array
	public static void removeDuplicatesFromArray(Integer[] nums) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		
		Integer[] result = set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(result));
	}

}
