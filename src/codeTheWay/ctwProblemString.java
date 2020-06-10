package codeTheWay;

import java.util.Scanner;

public class ctwProblemString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String cash = "W $666";
		String moneys = "666";
		char command = 'W';
		int money = 0;

		System.out.println("How much would you like to withdraw?");
		cash = input.nextLine();

		// Gets the command letter
		command = cash.charAt(0);
		System.out.println("The first letter is " + command);

		// Gets the amount of moneys

		moneys = cash.substring(4, cash.length());
		System.out.println(moneys);

		// converts money from string to int
		money = Integer.valueOf(moneys);
		System.out.println(money);

	}

}
