package multiDArraysPrimitives;

import java.util.Random;
import java.util.Scanner;

public class activityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int maxRow = 7;
		int maxCol = 3;
		int num = 0;
		int sum = 0;
		int[][] tests = new int[maxRow][maxCol];

		for (int row = 0; row < maxRow; row++) {
			for (int column = 0; column < maxCol; column++) {
				num = generator.nextInt(100 - 0 + 1) + 0;
				tests[row][column] = num;

			}
		}
		for (int row = 0; row < tests.length; row++)
			for (int column = 0; column < tests[0].length; column++)
				sum += tests[row][column];

		System.out.println("The sum of the values in the array = " + sum);

	}

}
