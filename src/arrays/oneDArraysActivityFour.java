package arrays;

import java.util.Scanner;

public class oneDArraysActivityFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testnum = 249;
		double largest = 0;
		double[] tests = new double[testnum];
		int count = 0;
		for (count = 0; count < testnum; count++) {
			System.out.println("Enter a test score.");
			tests[count] = input.nextDouble();
		}
		for (count = 0; count < testnum; count++) {
			if (tests[count] > largest) {
				largest = tests[count];
			}
		}
		System.out.println(largest);

	}

}
