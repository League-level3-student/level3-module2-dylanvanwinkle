package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms.SortingVisualizer;
import _01_Searching_Algorithms._00_LinearSearch;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return linearSearch(eggs,"cracked");
		
	}
	public static int linearSearch(List<String> eggs, String value) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals(value)) {
				System.out.println(i);
				return i;
			}
		}

		return -1;
	}
	public static int countPearls(List<Boolean> pearls) {
		int counter = 0;
		for (int i = 0; i < pearls.size(); i++) {
			if (pearls.get(i) == true) {
				counter++;
			}
		}
		return counter;
	}
	public static double findTallest(List<Double> hights) {
sort(hights);
return hights.get(hights.size() - 1);
	}
	static void sort(List<Double> hights) {
		//10. call the quickSort method with 0 and the length of the array minus one
		quickSort(hights,0,(hights.size() - 1));
	}
	
	private static void quickSort(List<Double> hights, int low, int high) {
		//2. create two integer variables called i and j and set them equal
		//   to low and high respectively.
       int i = low;
       int j = high;
        //3. create an integer called pivot and set it equal to the element
        //   in the array that is the halfway point between low and high
       int middle = (low + high) / 2;
       Double pivot = hights.get(middle);
    		   
        //4. make a while loop that goes while i is less than or equal to j
        while (i <= j) {
			
		
        	//5. make a while loop that increments i while 
        	//   the array element at i is less than pivot
            while (hights.get(i) < pivot) {
				i++;
			}
            //6. make a while loop that decrements j while 
        	//   the array element at j is greater than pivot
            while(hights.get(j)> pivot) {
            	j--;
            }
            //7. if i is less than or equal to j, 
            // array elements at i and j.
            //   In the same if-statement, increase i by 1 
            //   and decrease j by 1.
            if (i <= j) {
    			Double arrayAti = hights.get(i);
    			hights.set(i,hights.get(j)); 
    			hights.set(j, arrayAti);
    			i++;
    			j--;
    		}
        }
        //8. if low is less than j, call the quickSort method using
        //   low for the low and j for the high
        if (low < j) {
			quickSort(hights,low,j);
		}
        //9. if i is less than high, call the quickSort method using
        //   i for the low and high for the high.
	if (i < high) {
		quickSort(hights,i,high);
	}
        
	}
	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String Longest = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > Longest.length()) {
				Longest = words.get(i);
			}
		}
		return Longest;
	}
	public static Boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;		
			}
		}
		return false;
		
	}

}
