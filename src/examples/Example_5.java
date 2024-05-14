package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example_5 {

	public static void main(String[] args) {
		String newValueString_1 = "Programming";
		String newValueString_2 = "Programming";

		printDuplicateCharactersFromStr(newValueString_1);
		printDuplicateCharactersFromStr(newValueString_2);
	}

	// * Find all duplicate characters in a String and print each of them.
	private static void printDuplicateCharactersFromStr(String str) {
		char[] characters = str.toCharArray();

		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", str);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}

	}

}
