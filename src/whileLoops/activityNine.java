package whileLoops;

import java.util.Scanner;

public class activityNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		double first = input.nextDouble();
		int con = 1;
		while (con == 1) {
			System.out.println("type another number");
			double second = input.nextDouble();
			System.out.println("type another number");
			double third = input.nextDouble();
			System.out.println("The average of the two numbers is " + ((first + second + third) / 3));
			System.out.println("Continue? 1 = Y, 2 = No");
			con = input.nextInt();

		}

	}

}
