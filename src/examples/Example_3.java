package examples;

public class Example_3 {

	public static void main(String[] args) {
		
		System.out.println(stringContainsVowels("Hello"));
		
		System.out.println(stringContainsVowels("TV"));
	}

	// Check if a vowel is present in a string
	private static boolean stringContainsVowels(String input) {
		boolean result = input.toLowerCase().matches(".*[aeiou].*");
		return result;
	}

}
