package forLoops;

import java.util.Scanner;

public class largestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		int largest = 0;
		for (int count = 1; count <= num; count++) {
			if (num % count == 0) {
				int divisor = count;
				if (divisor > largest && divisor != num) {
					largest = divisor;
				}

			}

		}
		System.out.println(largest);

	}
}
