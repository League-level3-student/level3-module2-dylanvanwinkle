package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int arrAt0 = arr[j];
					arr[j] = arr[(j + 1)];
					arr[(j + 1)] = arrAt0;
				}
			}
			display.updateDisplay();
		}
	}

}
