package BigO_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Roman {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a Roman number: ");
		String romanString = keyboard.nextLine();

		int romanValue = 0; // 1
		int result = 0; // 1
		for (int i = 0; i < romanString.length(); i++) {

			romanValue = getValuebyChar(romanString.charAt(i)); // 1

			if (i < romanString.length() - 1
					&& getValuebyChar(romanString.charAt(i)) < getValuebyChar(romanString.charAt(i + 1))) {
				result -= romanValue;

			} else {
				result += romanValue;
			}
		}
		System.out.println("Value: " + result); // 1
	}

	// TIME COMPLEXITY: O(n+5)

	public static int getValuebyChar(char letter) {

		switch (letter) { // 1
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		}
		return 0;
	}

}
