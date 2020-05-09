package forLoops;

import java.util.Scanner;

public class classAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("how many students took the test?");
		int kids = input.nextInt();
		int total = 0;
		for (int count = 1; count <= kids; count++) {
			System.out.println("what was the score?");
			int score = input.nextInt();
			total = total + score;

		}
		int avarage = total / kids;
		System.out.println("the average was " + avarage);

	}

}
