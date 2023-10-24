package BigO_Algorithms;

import java.util.ArrayList;

public class LongestSameString {

	public static void main(String[] args) {

		String[] array = { "flower", "fly", "floor" };

		String[] secondArray = { "dog", "racecar", "car" };

		String output = findSameString(array); // 1
		String secondOutput = findSameString(secondArray); // 1

		System.out.println("First array output : " + output); // 1
		System.out.println("Second array output : " + secondOutput); // 1
	}

//TIME COMPLEXITY: O(2n+ 8)

	public static String findSameString(String[] array) {

		int length = array[0].length(); // 1
		for (int i = 0; i < array.length; i++) {
			if (i <array.length - 1 && array[i].length() > array[i+1].length()) {
				
				length = array[i+1].length();
			}			
		}

		char[] sameChar = new char[length];// 1
		String output = null;// 1

		for (int j = 0; j < length; j++) {

			if (array[0].charAt(j) == array[1].charAt(j) && array[1].charAt(j) == array[2].charAt(j)) {

				sameChar[j] = array[0].charAt(j);
				output = new String(sameChar);
			} else {
				return output;
			}
		}
		return "";// 1
	}

}
