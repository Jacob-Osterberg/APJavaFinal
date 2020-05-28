package arrays;

import java.util.Random;
import java.util.Scanner;

public class randomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int[] number = new int[10000];
		int count = 0;
		int sum = 0;
		int i = 0;
		while (i != 2) {
			for (count = 0; count < number.length; count++) {
				number[count] = generator.nextInt(100 - 1 + 1) + 1;
				count++;

			}
			System.out.println("Pick a number from 1 to 100");
			int num = input.nextInt();
			for (count = 0; count < number.length; count++) {
				if (number[count] == num) {
					sum++;

				}
			}
			System.out.println("The number " + num + " showed up " + sum + " times.");
			System.out.println("Would you like to go again?(1 = yes, 2 = no)");
			sum = input.nextInt();
		}

	}
}