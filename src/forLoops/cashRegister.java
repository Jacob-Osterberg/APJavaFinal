package forLoops;

import java.util.Scanner;

public class cashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("how many items were bought?");
		int items = input.nextInt();
		int total = 0;
		for (int count = 1; count <= items; count++) {
			System.out.println("what was the price?");
			int price = input.nextInt();
			total = total + price;

		}
		double tax = total * .05;
		System.out.println("The total cost without tax is " + total);
		System.out.println("Tax costs " + tax);
		System.out.println("The total cost wiht tax is " + (total + tax));
	}

}
