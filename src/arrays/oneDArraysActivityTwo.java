package arrays;

import java.util.Scanner;

public class oneDArraysActivityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testnum = 24999;
		double sum = 0;
		double[] tests = new double[testnum];
		int count = 0;
		for (count = 0; count < testnum; count++) {
			System.out.println("Enter a test score.");
			tests[count] = input.nextDouble();
		}
		for (count = testnum; count > -1; count--) {
			System.out.println(tests[count]);

		}

	}

}
