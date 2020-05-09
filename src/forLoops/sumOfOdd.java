package forLoops;

import java.util.Scanner;

public class sumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int total = 0;
		int sum = 0;
		System.out.println("gimmy a positive integer");
		int number = input.nextInt();
		for (int count = 1; number > 1; count++) {

			number = number - 2;
			total = total + number;
		}
		System.out.println("The sum is " + total);
	}

}
