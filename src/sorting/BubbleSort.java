package sorting;

import java.util.Arrays;

/*This class will sort the given data such a way, it will compare current and next variable
 * if found current is greater than next, swap will occur.
 * This way the largest value will go at the end of array.
 * */

/*for enhancing the performance we have kept flag to see whether swap happened or not,
 * if not than there is no more swap required and data is sorted.
 * for more enhancing the iteration, as we have kept largest value at the end we will not
 * again consider that and will not compare with anyone in the array.
*/
public class BubbleSort {

	public static void main(String[] args) {
		int data[] = { 5, 3, 1, 9, 8, 2, 4, 6, 7 };
		new BubbleSort().sort(data);
	}

	private void sort(int a[]) {

		boolean isSwapped = true;

		// Run the comparison from start to till end or till swapping is taking place
		for (int iteration = 0; iteration < a.length && isSwapped; ++iteration) {
			
			// Making flag false and end check whether any swapped happened or not
			isSwapped = false;
			for (int current = 0, next = current + 1; next < a.length - iteration; ++current, ++next) {
				if (a[current] > a[next]) {
//					Swap without using third variable
					a[next] = a[current] + a[next];
					a[current] = a[next] - a[current];
					a[next] = a[next] - a[current];
					isSwapped = true;
					continue;
				}
			}
			System.out.println("Gone through all the values Times : " + iteration);
			System.out.println("After " + iteration + "th iteration Current values are " + Arrays.toString(a));
		}

	}

}
