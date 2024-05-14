package examples;

public class Example_7 {

	public static void main(String[] args) {

		int[] newArray = {1, 7, 9, 12, 3 , 68, 44 , 12 , 8};
		largestNumber(newArray);
	}
	
	// find largest number in an array
	public static void largestNumber(int[] newArray) {
		int max = newArray[0];
		
		for (int i = 0; i < newArray.length; i++) {
			if (max < newArray[i]) {
				max = newArray[i];
			}
		}
		
		System.out.println("Array max value : "+ max );
	}

}
