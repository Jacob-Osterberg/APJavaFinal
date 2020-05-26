package arrays;

import java.util.Scanner;

public class oneDArraysA1S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int maxStudents = 5;
		double[] scores = new double[maxStudents];

		for (int i = 0; i < maxStudents; i++) {
			System.out.println("Enter a test score:");
			scores[i] = input.nextDouble();
		}

		double sum = 0;
		for (int i = 0; i < maxStudents; i++) {
			sum += scores[i];
		}

		System.out.println("Sum of the array values=" + sum);

	}

}
