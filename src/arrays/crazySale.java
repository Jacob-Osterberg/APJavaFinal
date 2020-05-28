package arrays;

import java.util.Random;
import java.util.Scanner;

public class crazySale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		double num = 0;
		double[] prices = new double[25];
		int count = 0;
		// getting the scores
		for (count = 0; count < prices.length; count++) {
			System.out.println("Enter an items price.");
			prices[count] = input.nextDouble();
		}
		for (count = 0; count < prices.length; count++) {
			num = generator.nextInt(100 - 0 + 1) + 0;
			prices[count] = prices[count] * (num / 100);
		}
		for (count = 0; count < prices.length; count++) {
			System.out.println("Item " + count + 1 + ": " + prices[count]);

		}

	}

}
