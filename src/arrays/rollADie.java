package arrays;

import java.util.Random;
import java.util.Scanner;

public class rollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int rollNum = 10000;
		double sum = 0;
		int num = 0;
		int heads = 0;
		int tails = 0;
		int[] roll = new int[rollNum];
		int count = 0;
		while (sum != 2) {
			for (count = 0; count < roll.length; count++) {
				while (count < rollNum) {
					roll[count] = generator.nextInt(2 - 1 + 1) + 1;
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
