package sorting;

import java.util.Arrays;

/*The selection sort start searching for the minimum element in the list.
 * one it get the minimum element in the list it swap that element with first index element.
 * Then it start searching for 2 smallest element in the list, once it find the second smallest
 * element it swap that element with second index and so on... till the last index.*/

public class SelectionSort {

	public static void main(String[] args) {
		int data[] = { 14, 33, 27, 10, 35, 19, 42, 44 };
		new SelectionSort().sort(data);
	}

	private void sort(int a[]) {
		System.out.println("Got the input as : " + Arrays.toString(a));

		
		// Start loop from o to n-1 and check the swap flag
		for (int startIndex = 0; startIndex < a.length - 1; ++startIndex) {
			int min = a[startIndex];
			// We assume first element is the smallest
			int startPosition = startIndex;
			for (int nextIndex = startIndex + 1; nextIndex < a.length; ++nextIndex) {
				if (min > a[nextIndex]) {
					// change the value of min
					min = a[nextIndex];

					// store the position where need to swap
					startPosition = nextIndex;

				}
			}
			// once you decided after iterating through the list, swap the values
			if (startPosition != startIndex) {
				System.out.println("Minimum value needs to be change at current index");
				a[startPosition] = a[startIndex];
				a[startIndex] = min;
			}
			// Show values after first iteration
			System.out.println("After " + startIndex + " iteration values in the array is: " + Arrays.toString(a));
		}

	}

}
