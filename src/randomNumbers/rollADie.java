package randomNumbers;

import java.util.Random;
import java.util.Scanner;

public class rollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("How many sides are on the die");
		int sides = input.nextInt();
		System.out.println("How many times is that die being rolled");
		int rolls = input.nextInt();
		int count = 0;
		int num = 0;
		while (count <= rolls) {
			num = generator.nextInt(sides - 1 + 1) + 1;
			System.out.println(num);

			count++;

		}

	}

}
