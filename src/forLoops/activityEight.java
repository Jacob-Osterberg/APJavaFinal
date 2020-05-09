package forLoops;

import java.util.Scanner;

public class activityEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		int numX = 0;
		for (int count = 1; count < 51; count++) {
			numX = numX + count * num;
			System.out.println(numX);

		}

	}

}
