package arrays;

import java.util.Scanner;

public class oneDArraysActivityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] tests = new double[5];
		int count = 0;
		for (count = 0; count < 5; count++) {
			System.out.println("Enter a test score.");
			tests[count] = input.nextDouble();
		}
		System.out.println(tests[0] + " " + tests[1] + " " + tests[2] + " " + tests[3] + " " + tests[4]);
	}

}
