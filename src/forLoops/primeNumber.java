package forLoops;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		int divisor = 0;
		for (int count = 1; count <= num; count++) {
			if (num % count == 0) {
				divisor = divisor + count;
				if (divisor == 2) {
					System.out.println("Your number is prime.");
				}
			}

		}

	}

}
