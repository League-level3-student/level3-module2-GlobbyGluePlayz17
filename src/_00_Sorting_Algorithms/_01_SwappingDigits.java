package _00_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _01_SwappingDigits {

	@Test
	void test() {
		int[] x = {5, 6};
		int[] y = {6, 5};
		swapArrayOfTwo(x);
		assertArrayEquals(y, x);
		
		int[] z = {7, 3, 5, 9, 2};
		int[] q = {2, 3, 5, 7, 9};
		sortIntArray(z);
		assertArrayEquals(q, z);
		
		int[] m = {7, 3, 9, 5, 2};
		findMiddle(m);
//		for (int i = 0; i < m.length; i++) {
//			System.out.println(m[i]);
//		}
//		System.out.println(m[(int) (m.length/2+0.5)]);
//		System.out.println(m.length);
//		System.out.println(m[3]);
		assertEquals(5, findMiddle(m));
	}
	
	//1. Complete the method so that the first two elements of the array are swapped
	public static void swapArrayOfTwo(int[] arr) {
		int arr0 = arr[0];
		int arr1 = arr[1];
		arr[0] = arr1;
		arr[1] = arr0;
	}
	
	//2. Complete the method so that it sorts the array using a bubble sort.
	//   Iterate through the array and when you find two elements that are out
	//   of order, swap them. Repeat this until the array is in order.
	public static void sortIntArray(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					continue;
				} else {
					int arr0 = arr[i];
					int arr1 = arr[j];
					arr[i] = arr1;
					arr[j] = arr0;
				}
			}
		}
	}
	
	//3. Complete the method so that it finds the middle number **(median)** in the array.
	//   *Hint* it helps to sort it first.
	//   *Double Hint* Use the method you already wrote in step 2 to sort it
	public static int findMiddle(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					continue;
				} else {
					int arr0 = arr[i];
					int arr1 = arr[j];
					arr[i] = arr1;
					arr[j] = arr0;
				}
			}
		}
		
		int elementofmedian = (int) (arr.length/2+0.5);
		return arr[elementofmedian];
	}
}
