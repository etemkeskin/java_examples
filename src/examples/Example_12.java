package examples;

import java.util.Arrays;

public class Example_12 {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		isStringsAnagram(str1, str2);
	}
	
	// Check if two strings are anagrams.
	public static void isStringsAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}

}
