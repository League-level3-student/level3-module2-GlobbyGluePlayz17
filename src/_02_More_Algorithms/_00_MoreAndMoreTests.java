package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {
	
	public static String multiply(int num1, int num2) {
		return num1 + " x " + num2 + " = " + num1 * num2;
	}
	
	@Test
	  public void MultTest() {
		
	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	    
	  }
	
	public static boolean isPrime(int num1) {
	boolean isPrime = true;
		for (int i = 2; i < 100; i++) {
			if (i != num1) {
				if (num1%i == 0) { 
					isPrime = false;
					break;
				} 
			}
		}
		System.out.println(isPrime);
		return isPrime;
	}
	
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }

	public static boolean isSquare(int num1) {
		boolean isSquare = false;
		double sqrt = Math.sqrt(num1);
		if (sqrt == (int)sqrt) {
			isSquare = true;
		}
		return isSquare;
	}
	
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }

	public static boolean isCube(int num1) {
		boolean isCube = false;
		double crt = Math.cbrt(num1);
		if (crt == (int)crt) {
			isCube = true;
		}
		return isCube;
	}
	
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }



}
