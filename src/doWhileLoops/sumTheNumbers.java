package doWhileLoops;

import java.util.Scanner;

public class sumTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int numO = 0;
		do {
			System.out.println("enter a number(999 to quit)");
			numO = input.nextInt();
			if (numO != 999) {
				sum += numO;
				System.out.println("enter a number(999 to quit)");
				int numT = input.nextInt();
				sum += numT;
			}
		} while (numO == 999);
		System.out.println("The sum is " + sum);
		sum = 0;

	}
}
