package multiDArraysPrimitives;

import java.util.Random;
import java.util.Scanner;

public class rollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int num = 0;
		System.out.println("How many students are in the class?");
		int students = input.nextInt();
		System.out.println("How many times would you like to roll that Die?");
		int rolls = input.nextInt();
		System.out.println("How many sides is the die?");
		int sides = input.nextInt();
		int[][] die = new int[rolls][students];
		for (int row = 0; row < rolls; row++) {
			for (int column = 0; column < students; column++) {
				num = generator.nextInt(sides - 1 + 1) + 1;
				die[row][column] = num;
			}
		}

	}

}
