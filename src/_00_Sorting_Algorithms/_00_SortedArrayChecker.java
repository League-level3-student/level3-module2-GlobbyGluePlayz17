package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	
	//int[] ints = {0, 20, 335, 95};
	public static boolean intArraySorted() {
		String bolean = "false";
		for (int i = 1; i < array.length; i++) {
			if (ints[i]>=ints[i-1]) {
				bolean = "true";
			} else {
				bolean = "false;"
				break;
			}
		}
		if (bolean == "true") {
			return true;
		} else {
			return false;
		}
	}
	
	//2. Write a static method called doubleArraySorted.
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	
	public static boolean doubleArraySorted() {
		
		return false;
	}

	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)

	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)

}
