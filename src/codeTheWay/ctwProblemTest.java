package codeTheWay;

import java.util.Scanner;

public class ctwProblemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		ATM bank = new ATM();
		String cash = "W $666";
		String moneys = "666";
		char command = 'W';
		int money = 0;
		int quiter = 1;

		while (quiter == 1) {
			System.out.println("What would you like to do?");
			cash = input.nextLine();

			command = cash.charAt(0);

			if(cash.length() > 1) {
			moneys = cash.substring(3, cash.length());
			}
			money = Integer.valueOf(moneys);

			if (command == 'W') {
				bank.withdraw(money);
			}
			if (command == 'R') {
				bank.restock();
			}
			if (command == 'I') {
				bank.denominations();
			}
			if (command == 'Q') {
				quiter = 2;
			}else {
				System.out.println("Failure: Invalid Command");
			}

		}

	}

}
