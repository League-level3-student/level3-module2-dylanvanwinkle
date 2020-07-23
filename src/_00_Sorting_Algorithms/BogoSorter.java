package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	_00_SortedArrayChecker sac = new _00_SortedArrayChecker();
	Random r = new Random();

	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] i, SortingVisualizer display) {
		while (!sac.intArraySorted(i)) {
			int ran1 = r.nextInt(i.length - 1);
			int ran2 = r.nextInt(i.length - 1);
			int iAtran1 = i[ran1];
			i[ran1] = i[ran2];
			i[ran2] = iAtran1;
			display.updateDisplay();
		}
	}
}