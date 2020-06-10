package codeTheWay;

import java.util.Scanner;

public class ctwProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int cash = 0;
		int hundreds = 0;
		int fifties = 0;
		int twentys = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;

		System.out.println("How much would you like to withdraw?");
		cash = input.nextInt();
		if (cash / 100 >= 0) {
			for (hundreds = 0; cash > 0; hundreds++) {
				cash = cash - 100;
				if (cash < 0) {
					cash = cash + 100;
					break;
				}
			}
		}
		if (cash / 50 >= 0) {
			for (fifties = 0; cash > 0; fifties++) {
				cash = cash - 50;
				if (cash < 0) {
					cash = cash + 50;
					break;
				}
			}
		}
		if (cash / 20 >= 0) {
			for (twentys = 0; cash > 0; twentys++) {
				cash = cash - 20;
				if (cash < 0) {
					cash = cash + 20;
					break;
				}
			}
		}
		if (cash / 10 >= 0) {
			for (tens = 0; cash > 0; tens++) {
				cash = cash - 10;
				if (cash < 0) {
					cash = cash + 10;
					break;
				}
			}
		}
		if (cash / 5 >= 0) {
			for (fives = 0; cash > 0; fives++) {
				cash = cash - 5;
				if (cash < 0) {
					cash = cash + 5;
					break;
				}
			}
		}
		if (cash / 1 >= 0) {
			for (ones = 0; cash > 0; ones++) {
				cash = cash - 1;
				if (cash < 0) {
					cash = cash + 1;
					break;
				}
			}
		}
		// System.out.println(cash);
		// System.out.println(hundreds);
		// System.out.println(fifties);
		// System.out.println(twentys);
		// System.out.println(tens);
		// System.out.println(fives);
		// System.out.println(ones);
	}

}
