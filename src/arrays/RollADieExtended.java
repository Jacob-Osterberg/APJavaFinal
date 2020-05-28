package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollADieExtended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		double sum = 0;
		int num = 0;
		int one = 0;
		int two = 0;
		int count = 0;
		System.out.println("How many sides is the die?");
		int sides = input.nextInt();
		System.out.println("How many times would you like to roll that Die?");
		int rollNum = input.nextInt();
		int[] roll = new int[rollNum];
		
		while (sum != 2) {
			for (count = 0; count < roll.length; count++) {
				while (count < roll.length) {
					roll[count] = generator.nextInt(sides - 1 + 1) + 1;
					count++;
				}

			}
			for (count = 0; count < rollNum; count++) {
				if (roll[count] == 2) {
					heads++;
				} else {
					tails++;
				}
			}
			for (count = 0; count < 2; count++) {
				System.out.println("How many heads(1) or tails(2) do you want to see?");
				num = input.nextInt();
				if (num == 2) {
					System.out.println(heads);

				} else {
					System.out.println(tails);
				}
			}
			System.out.println("Would you like to go again?(1 = yes, 2 = no)");
			sum = input.nextInt();
		}

	}

}
