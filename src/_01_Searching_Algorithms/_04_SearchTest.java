package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = {"word", "at", "farther", "reach", "table", "one"};
		assertEquals(5, _00_LinearSearch.linearSearch(words, "one"));
		
		String[] numbers = {"960", "46", "7", "989", "29345"};
		assertEquals(-1, _00_LinearSearch.linearSearch(numbers, "950"));

		String[] characters = {"a", "d", "i", "j", "e"};
		assertEquals(2, _00_LinearSearch.linearSearch(characters, "i"));

	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] numbers = {1, 2, 3, 3, 4, 9, 9};
		assertEquals(2, 3, _01_BinarySearch.binarySearch(numbers, 0, numbers.length-1, 3));
		
		int[] a = {37859, 283755, 293865134, 439857, 92038, 9128975, 0, -19864, 100000, 3};
		assertEquals(-1, _01_BinarySearch.binarySearch(numbers, 0, numbers.length-1, 6799));
		
		int[] b = {0, 283755, 293865134, 439857, 92038, 9128975, 0, -19864, 100000, 3};
		assertEquals(0, 5, _01_BinarySearch.binarySearch(numbers, 0, numbers.length-1, 0));
		
//		int[] r = {37859, 283755, 293865134, 439857, 92038, 9128975, 0, -19864, 100000, 3};
//		assertEquals(9, _01_BinarySearch.binarySearch(numbers, 0, numbers.length-1, 3));
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] values = {1, 3, 5, 7, 3, 8, 2, 8};
		assertEquals(1, 4, _02_InterpolationSearch.interpolationSearch(values, 3));
		
		int[] t = {12, 345, 6789, 10000, -48620};
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(values, 3));
		
		int[] q = {1, 3, 5, 7, 3, 8, 2, 8};
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(values, 7));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] values = {0 ,2, 4, 6, 8, 10};
		assertEquals(5, _03_ExponentialSearch.exponentialSearch(values, 10));
	}
}
