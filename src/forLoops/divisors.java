package forLoops;

import java.util.Scanner;

public class divisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		for (int count = 1; count <= num; count++) {
			if (num % count == 0) {
				int divisor = count;
				System.out.println(divisor);

			}

		}

	}

}
