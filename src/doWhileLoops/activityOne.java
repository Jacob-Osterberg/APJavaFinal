package doWhileLoops;

import java.util.Scanner;

public class activityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		do {
			System.out.println("your magic number is " + (num * 17));
			System.out.println("Please enter a number(9999 to quit)");
			num = input.nextInt();

		} while (num != 9999);
		{

		}

	}

}
