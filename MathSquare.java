package BigO_Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class MathSquare {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
			System.out.print("Please input a number: ");
			int number = keyboard.nextInt();
			
			double squareRootNumber = calculateSquareRoot(number); //1
			System.out.println("Square root number: " + squareRootNumber); //1
			
	}
	
// TIME COMPLEXITY: O(2n + 10)
	
	public static double calculateSquareRoot(int number) {
	
			double closestIntSquareRootNumber = 0; //1
			double squareNumber = 0; //1
			double squareRootNumber = 0; //1

			for (int i = 0; i < Integer.MAX_VALUE; i++) {

				squareNumber = i * i; //1

				if (squareNumber > number) {
					closestIntSquareRootNumber = i - 1;
					break;
				}
			}

			double[] squareRootNumbers = new double[4]; //1
			for (int j = 1; j < squareRootNumbers.length; j++) {
				squareRootNumbers[0] = closestIntSquareRootNumber; //1

				squareRootNumbers[j] = 0.5 * (squareRootNumbers[j - 1] + number / squareRootNumbers[j - 1]);

				squareRootNumber = squareRootNumbers[j];//1
			}
			return squareRootNumber; //1
		}

	}


