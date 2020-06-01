package multiDArraysPrimitives;

import java.util.Random;
import java.util.Scanner;

public class activityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int maxRow = 14;
		int maxCol = 9;
		int num = 0;
		int[][] tests = new int[maxRow][maxCol];

		for (int row = 0; row < maxRow; row++) {
			for (int column = 0; column < maxCol; column++) {
				num = generator.nextInt(100 - 0 + 1) + 0;
				tests[row][column] = num;

			}
		}

		for (int row = 0; row < maxRow; row++) {
			for (int column = 0; column < maxCol; column++) {
			
				System.out.print(tests[row][column] + " ");

			}
			System.out.println("");
		}
	}

}
