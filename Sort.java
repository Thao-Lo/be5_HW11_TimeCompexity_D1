package BigO_Algorithms;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {

		int[] array = { 2, 0, 1, 1, 0, 0, 1, 2, 2 };
		int[] sortArray = sortArray(array); //1

		System.out.println("Sort Array: " + Arrays.toString(sortArray)); //1

	}
	//TIME COMPLEXITY: O(n+6)
	public static int[] sortArray(int[] array) {
		
		int[] sortArray = new int[array.length];//1
		int zero = 0; //1
		int one = 0; //1
		int two = sortArray.length - 1; //1

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				sortArray[zero] = 0;
				zero++;
			}
			if (array[i] == 1) {
				sortArray[zero + one] = 1;
				one++;
			}
			if (array[i] == 2) {
				sortArray[two] = 2;
				two--;
			}
		}
		return sortArray; //1
	}
} 
