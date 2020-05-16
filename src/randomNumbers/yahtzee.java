package randomNumbers;

import java.util.Random;

public class yahtzee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 0;
		int num = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int yahtzeeT = 0;
		while (yahtzeeT != 2) {
			while (count <= 5) {
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
			count = 0;
			if (ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5) {
				System.out.println("you got Yahtzee!");
				yahtzeeT = 2;

			} else {
				System.out.println("Try again");
			}

		}

	}

}
