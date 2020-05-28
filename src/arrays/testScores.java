package arrays;

import java.util.Scanner;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		double sum = 0;
		double[] tests = new double[10];
		int count = 0;
		// getting the scores
		for (count = 0; count < tests.length; count++) {
			System.out.println("Enter a test score.");
			tests[count] = input.nextDouble();
		}

		// largest
		double largest = 0;

		for (count = 0; count < tests.length; count++) {
			if (tests[count] > largest) {
				largest = tests[count];
			}
		}
		System.out.println("The largest Test score was " + largest);
		// Smallest
		double smallest = 999;

		for (count = 0; count < tests.length; count++) {
			if (tests[count] < smallest) {
				smallest = tests[count];
			}
		}
		System.out.println("The smallest test score was " + smallest);

		// average

		for (count = 0; count < tests.length; count++) {
			sum = sum + tests[count];

		}
		sum = sum / tests.length;
		System.out.println("The average test score was " + sum);

		// all of them
		for (count = 0; count < tests.length; count++) {
			System.out.println("Test " + count + 1 + ": " + tests[count]);

		}
	}

}
