package nestedLoops;

import java.util.Scanner;

public class perfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 1;
		int total = 0;
		int divisor = 0;
		while (num <= 1000) {
			for (int count = 1; count < num; count++) {
				if (num % count == 0) {
					divisor = count;
					total = total + divisor;

				}

			}

			if (total == num) {
				System.out.println(num);
			}
			num++;
			divisor = 0;
			total = 0;

		}

	}

}
