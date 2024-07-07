package examples;

public class Example_13 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		int low = 0;
		int high = 24;
		int key = 53;
		int indexOfKey = binarySearch(arr, low, high, key);
		System.out.println("Index of searched number in array :" + indexOfKey);

	}

	// The array elements must be sorted to implement binary search.
	// This linear search has a time complexity of O(n).
	// if return is -1, it does not exist.
	// if it exists, it return index of array.
	public static int binarySearch(int arr[], int low, int high, int key) {
		int mid = (low + high) / 2;
		int loopNumber = 0;
		while (low <= high) {
			// Calculate Loop Number
			loopNumber = loopNumber + 1;
			System.out.println("Loop number is : " + loopNumber);

			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;

		}

		if (low > high) {
			return -1;
		}

		return -1;
	}

}
