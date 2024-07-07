package examples;

import java.util.HashSet;
import java.util.Set;

public class Example_14 {

	public static void main(String[] args) {
		//Print all unique words of a String
		String str = "What a beautiful day in a World. We love life what give us. World is wonderfull";
		printUniqueWords(str);
	}

	public static void printUniqueWords(String str) {
		Set<String> wordSet = new HashSet<>();
		String[] words= str.split(" ");
		for (String word : words) {
			wordSet.add(word);
		}
		
		for (String word : wordSet) {
			System.out.println(word);
		}
	}
}
