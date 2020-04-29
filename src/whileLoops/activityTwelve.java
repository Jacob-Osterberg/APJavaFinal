 package whileLoops;

import java.util.Scanner;

public class activityTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int first = input.nextInt();
		int con = 1;
		while (con == 1) {
			System.out.println("type another number");
			int second = input.nextInt();
			if (second != -9999) {
				System.out.println("type another number");
				int third = input.nextInt();
			}
			System.out.println("Continue? 1 = Y, 2 = No");
			con = input.nextInt();

		}

	}

}

	


