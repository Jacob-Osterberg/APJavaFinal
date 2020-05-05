package whileLoops;

import java.util.Scanner;

public class countByFives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int total = input.nextInt();
		int num = 5;
		while (num < total) {
			System.out.println(num);
			num += 5;
		}

	}

}
