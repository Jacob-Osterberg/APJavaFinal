package arrays;

import java.util.Scanner;

public class ssnBreakdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double sum = 0;
		int[] start = new int[10];
		int[] middle = new int[10];
		int[] end = new int[10];
		int[] tests = new int [10];
		int count = 0;
		
		
		
		// getting the ssns
		for (count = 0; count < tests.length; count++) {
			System.out.println("Enter a SSN in this format");
			System.out.println("***-**-****");
			start[count] = input.nextInt();
			System.out.println("**");
			middle[count] = input.nextInt();
			System.out.println("****");
			end[count] = input.nextInt();
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
