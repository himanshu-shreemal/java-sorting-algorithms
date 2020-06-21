package sorting;

import java.util.Arrays;

/*The insertion sort, as the name it insert the value in sub-sorted list.
 * it assumes first value to be smallest then it starts comparing with next value.
 * if the next value is small, swap will take place.
 * Then it will compare the second value with third and check whether it is larger or not
 * if not it will insert it in sorted sub list and again with in the sorted sub-list it will
 * set the newly inserted element on it's correct position*/

public class InsertionSort {

	public static void main(String[] args) {
		int data[] = { 14, 33, 27, 10, 35, 19, 42, 44 };
		new InsertionSort().sort(data);
	}

	private void sort(int data[]) {
		int currentIndex;

		// Start iterating over the array
		for (int i = 0; i < data.length - 1; ++i) {
			if (data[i] > data[i + 1]) {
				// Swap without using third variable
				data[i] += data[i + 1];
				data[i + 1] = data[i] - data[i + 1];
				data[i] = data[i] - data[i + 1];
				currentIndex = i;

				// print the value after swapping
				System.out.println("Value after " + i + " iteration check" + Arrays.toString(data));

				// Check with in the existing shorted-sub list
				while (currentIndex > 0) {
					System.out.println("after inserting check if any existing value is smaller");

					/*
					 * If find anything greater than current index , swap it till you reach zero
					 * position
					 */
					if (data[currentIndex] < data[currentIndex - 1]) {
						data[currentIndex] += data[currentIndex - 1];
						data[currentIndex - 1] = data[currentIndex] - data[currentIndex - 1];
						data[currentIndex] = data[currentIndex] - data[currentIndex - 1];
						System.out.print("Got the smaller value and swapped ");
						System.out.println(Arrays.toString(data));
						--currentIndex;
						continue;
					} else {
						System.out.println("Everything is fine");
						break;
					}
				}
				continue;
			}
			System.out.println("Value after " + i + " iteration " + Arrays.toString(data));
		}
		System.out.println("Finally got the result : " + Arrays.toString(data));
	}

}
