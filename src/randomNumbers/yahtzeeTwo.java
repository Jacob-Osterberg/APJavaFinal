package randomNumbers;

import java.util.Random;

public class yahtzeeTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 1;
		int num = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int yahtzeeT = 0;
		int minCount = 1000000;
		int repeats = 0;
		while (yahtzeeT <= 100) {
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

			if (ones == 5 || twos == 5 || threes == 5 || fours == 5 || fives == 5 || sixes == 5) {
				yahtzeeT++;

			} else {
				
				repeats++;
			}
			if (repeats < minCount) {
				minCount = repeats;
			}
			ones = 0;
			twos = 0;
			threes = 0;
			fours = 0;
			fives = 0;
			sixes = 0;
			count = 0;
		}
		System.out.println(minCount);

	}

}
