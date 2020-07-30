package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class _00_MoreAndMoreTests {

	@Test
	public void MultTest() {
		Multiply m = new Multiply();
		assertEquals(0, m.multiply(10, 0));
		assertEquals(100, m.multiply(10, 10));
		assertEquals(88, m.multiply(8, 11));
	}

	@Test
	public void PrimeTest() {
		IsPrime ip = new IsPrime();

		assertTrue(ip.isPrime(3));
		assertTrue(ip.isPrime(5));
		assertTrue(ip.isPrime(541));
		assertFalse(ip.isPrime(4));
		assertFalse(ip.isPrime(12));
		assertFalse(ip.isPrime(527));

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

	private boolean isSquare(int i) {
		// TODO Auto-generated method stub
		double s = Math.sqrt(i);
		if (Math.floor(s) - s == 0) {
			return true;
		}
		return false;
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

	private boolean isCube(int i) {
		for (int j = 0; j <= i; j++) {
			if (Math.pow(j, 3) == i) {
				return true;
			}
		}
		return false;
	}

}
