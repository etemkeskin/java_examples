package examples;

public class Example_1 {

	public static void main(String[] args) {
		String str = "Example 1234";
		System.out.println(reverseString(str));

	}

	// Reverse a String 
	private static String reverseString(String str) {
		if (str == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}
		
		StringBuilder out = new StringBuilder();
		char[] chars = str.toCharArray();
		
		for (int i = chars.length-1; i >= 0; i--) {
			out.append(chars[i]);
		}
		
		return out.toString();
	}

}
