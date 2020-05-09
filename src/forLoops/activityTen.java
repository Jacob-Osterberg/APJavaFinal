package forLoops;

import java.util.Scanner;

public class activityTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int sum = 0;

		for (int count = 1; count < 10001; count++) {
			System.out.println("enter a number");
			int num = input.nextInt();
			sum += num;

		}
		System.out.println("sum = " + sum);

	}

}
