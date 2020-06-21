package sorting;

import java.util.Arrays;

/*In the quick sort we need to chose a pivot element, that help us to sort the data.
 * We can choose any value as pivot and we will keep all the small values compare to pivot at 
 * left and large value at right. At last we will swap the pivot value at it's correct position.
 * will repeat same till we sort the all the elements of data*/
public class QuickSort {

	static int data[] = {5,8,4,2,4,8,9,72,50,60,80,91,87,50};//{ 90, 30, 40, 9, 3, 50, 6, 3, 2, 80, 10 };
	static int iteration = 1;
	public static void main(String[] args) {

		int low = 0;
		int high = data.length - 1;

		new QuickSort().sort(low, high);
	}

	private void sort(int low, int high) {
		if (low < high) {
			System.out.println("--------------------------------------  iteration "+ ++iteration);
			System.out.println("Sort data request from " + low + " to " + high);
			int pivotPosition = partition(low, high);
			System.out.println(" new Pivot position = " + pivotPosition);
			sort(low, pivotPosition-1);

//		Uncomment below and comment next sort, compare the number of iteration
//			sort(pivotPosition, high);
			sort(pivotPosition+1, high);
		}
	}

	private int partition(int low, int high) {
		int leftPointer = low;
		int rightPointer = high - 1;
		int pivot = data[high];

		while (leftPointer <= rightPointer) {
			while (data[leftPointer] <= pivot && leftPointer < high)
				++leftPointer;
			while (rightPointer > low && data[rightPointer] > pivot)
				--rightPointer;
			if (rightPointer > leftPointer)
				swap(leftPointer, rightPointer);
			else
				break;
		}
		if (data[leftPointer] > data[high])
			swap(leftPointer, high);
		System.out.println(Arrays.toString(data));
		return leftPointer;
	}

	private void swap(int leftPointer, int rightPointer) {
		int temp = data[leftPointer];
		data[leftPointer] = data[rightPointer];
		data[rightPointer] = temp;
	}

}
