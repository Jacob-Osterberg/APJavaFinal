package nestedLoops;

import java.util.Scanner;

public class primeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int digit = input.nextInt();
		int num = 1;

		int divisor = 0;
		while (num < digit) {
			for (int count = 1; count < num; count++) {
				if (digit % count == 0) {
					divisor = count;

					System.out.println(divisor);
				}
			}

		}
		divisor = 0;
		num++;
	}
}
