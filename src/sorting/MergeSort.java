package sorting;

import java.util.Arrays;

/*This class will show how the merge sort work. It simply work on divide & conquer method.
 * It will break the problem in the chunks till it is no more breakable.
 * than it start merging. It compares the values than merge.*/

class MergeSort {

	static int tempArray[];

	public static void main(String[] args) {
		int data[] = { 38, 27, 43, 3, 9, 82, 10, 5, 18, 3 };
		System.out.println("Started with data : " + Arrays.toString(data));
		tempArray = Arrays.copyOf(data, data.length);

		// Start dividing the data than sort
		new MergeSort().divide(0, data.length - 1, data);

		// once our work is done release the memory
		tempArray = new int[] {};
	}

	private void divide(int low, int high, int data[]) {
		int mid = (low + high) / 2;
		System.out.println("Divide data: low " + low + " high " + high);
		if (low < high) {
			divide(low, mid, data);
			divide(mid + 1, high, data);
			merge(low, mid, high, data);
		}
	}

	private void merge(int low, int mid, int high, int data[]) {

		int i = low;
		int j = mid + 1;
		int k = low;
		System.out.println("Merge Data request for ----- low " + low + " mid " + mid + " high " + high);

		// Compare data from low boundary of left array and start of right array, we
		// will choose which ever is small
		while (i <= mid && j <= high) {
			if (data[i] > data[j]) {
				tempArray[k] = data[j];
				++j;
			} else {
				tempArray[k] = data[i];
				++i;
			}
			++k;
		}

		// copy rest of the element from left side array
		while (i <= mid) {
			tempArray[k] = data[i];
			++i;
			++k;
		}

		// Copy the sorted content to actual array
		while (low <= high) {
			data[low] = tempArray[low];
			++low;
		}

		System.out.print("After merfe data is :");
		System.out.println(Arrays.toString(data));

	}

}
