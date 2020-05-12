package nestedLoops;

import java.util.Scanner;

public class divisorInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int digit = input.nextInt();
		int num = 1;
		int number = 0;
		int largest = 0;
		int divisor = 0;
		while (num <= digit) {
			for (int count = 1; count <= num; count++) {
				if (num % count == 0) {
					divisor++;
				}
			}
			if (divisor > largest) {
				largest = divisor;
				number = num;
			}
			divisor = 0;
			num++;
		}
		System.out.println(largest + " " + number);

	}

}
