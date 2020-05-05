package doWhileLoops;

import java.util.Scanner;

public class activityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		double num = input.nextDouble();
		do {
			System.out.println("your magic number is " + (Math.pow(num, 5)));
			System.out.println("Please enter a number(9999 to quit)");
			num = input.nextDouble();

		} while (num != 9999);
		{

		}

	}

}
