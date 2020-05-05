package whileLoops;

import java.util.Scanner;

public class testScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a test score(9999 to exit)");
		double first = input.nextDouble();
		double sum = 0;
		double average = 0;
		while (first != 9999) {
			if (first > 69) {
				sum += first;
				average += 1;
			}
			System.out.println("type another test score(9999 to exit)");
			first = input.nextDouble();
		}
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + (sum / average));

	}

}
