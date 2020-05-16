package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class rollADieTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many times is that die being rolled");
		double rolls = input.nextDouble();
		int count = 1;
		int num = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		while (count <= rolls) {
			num = generator.nextInt(6 - 1 + 1) + 1;
			if (num == 1) {
				ones++;
			}
			if (num == 2) {
				twos++;
			}
			if (num == 3) {
				threes++;
			}
			if (num == 4) {
				fours++;
			}
			if (num == 5) {
				fives++;
			}
			if (num == 6) {
				sixes++;
			}

			count++;

		}
		System.out.println("One was rolled " + ones + " times, or " + (ones / rolls * 100) + " percent of the time.");
		System.out.println("Two was rolled " + twos + " times, or " + (twos / rolls* 100) + " percent of the time.");
		System.out.println("Three was rolled " + threes + " times, or " + (threes / rolls* 100) + " percent of the time.");
		System.out.println("Four was rolled " + fours + " times, or " + (fours / rolls* 100) + " percent of the time.");
		System.out.println("Five was rolled " + fives + " times, or " + (fives / rolls* 100) + " percent of the time.");
		System.out.println("Six was rolled " + sixes + " times, or " + (sixes / rolls* 100) + " percent of the time.");

	}

}
