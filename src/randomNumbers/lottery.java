package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first winning number?");
		int numOne = input.nextInt();
		System.out.println("What is the second winning number?");
		int numTwo = input.nextInt();
		System.out.println("What is the third winning number?");
		int numThree = input.nextInt();
		System.out.println("What is the fourth winning number?");
		int numFour = input.nextInt();
		System.out.println("what is the smallest end of the range");
		int min = input.nextInt();
		System.out.println("what is the largest end of the range");
		int max = input.nextInt();
		int count = 0;

		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;

		int lotteryT = 0;

		while (lotteryT != 1) {
			ones = generator.nextInt(max - min + 1) + min;
			twos = generator.nextInt(max - min + 1) + min;
			threes = generator.nextInt(max - min + 1) + min;
			fours = generator.nextInt(max - min + 1) + min;
			count++;

			if ((ones == numOne || ones == numTwo || ones == numThree || ones == numFour)
					&& (twos == numOne || twos == numTwo || twos == numThree || twos == numFour)
					&& (threes == numOne || threes == numTwo || threes == numThree || threes == numFour)
					&& (fours == numOne || fours == numTwo || fours == numThree || fours == numFour)) {
				System.out.println("It took " + count + " tries to get the correct numbers.");
				lotteryT++;
			} else {
				ones = 0;
				twos = 0;
				threes = 0;
				fours = 0;

			}
		}

	}

}
