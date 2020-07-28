package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms.QuickSorter;
import _00_Sorting_Algorithms.SortingVisualizer;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.

		_00_LinearSearch ls = new _00_LinearSearch();
		String[] words = { "hi", "bye", "pizza" };

		String searchValue = words[2];

		int index = ls.linearSearch(words, searchValue);

		assertEquals(2, index);
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		_01_BinarySearch BinarySearch = new _01_BinarySearch();
		int[] i2 = {20000,124,132,9342};


			for (int i = 0; i < i2.length; i++) {
				for (int j = 0; j < i2.length - 1; j++) {
					if (i2[j] > i2[j + 1]) {
						int iAt0 = i2[j];
						i2[j] = i2[(j + 1)];
						i2[(j + 1)] = iAt0;
				}
				
			}
		}
			int index = BinarySearch.binarySearch(i2,0,(i2.length - 1),i2[i2.length - 1]);
			
			assertEquals((i2.length - 1),index );
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
	}
}
