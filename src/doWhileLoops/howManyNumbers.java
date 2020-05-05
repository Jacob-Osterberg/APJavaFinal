package doWhileLoops;

import java.util.Scanner;

public class howManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int numO = 0;
		int counter = 1;
		do {
			System.out.println("enter a number");
			numO = input.nextInt();
			sum += numO;
			counter++;
		} while (sum <= 2020);
		System.out.println("You guessed " + sum + " in " + counter + " tries.");

	}
}
