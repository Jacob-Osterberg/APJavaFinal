package codeTheWay;

public class ATM {

	String cash = "W $666";
	String moneys = "666";
	char command = 'W';
	int money = 0;
	int ogMoney = 0;
	int hundreds = 0;
	int fifties = 0;
	int twentys = 0;
	int tens = 0;
	int fives = 0;
	int ones = 0;
	int hundredsTracker = 0;
	int fiftiesTracker = 0;
	int twentysTracker = 0;
	int tensTracker = 0;
	int fivesTracker = 0;
	int onesTracker = 0;
	int hundred = 10;
	int fifty = 10;
	int twenty = 10;
	int ten = 10;
	int five = 10;
	int one = 10;

	public ATM() {

	}

	public void restock() {
		hundred = 10;
		fifty = 10;
		twenty = 10;
		ten = 10;
		five = 10;
		one = 10;
		System.out.println("Machine balance: ");
		System.out.println("$100 - " + hundred);
		System.out.println("$50 - " + fifty);
		System.out.println("$20 - " + twenty);
		System.out.println("$10 - " + ten);
		System.out.println("$5 - " + five);
		System.out.println("$1 - " + one);

	}

	public void denominations() {
		System.out.println("Machine balance: ");
		System.out.println("$100 - " + hundred);
		System.out.println("$50 - " + fifty);
		System.out.println("$20 - " + twenty);
		System.out.println("$10 - " + ten);
		System.out.println("$5 - " + five);
		System.out.println("$1 - " + one);

	}

	public void withdraw(int money) {
		ogMoney = money;
		if (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10 + five * 5 + one * 1 < money) {
			System.out.println("Failure: insufficient funds");
		} else {
			if (money / 100 >= 0) {
				while (hundred > 0 && money >= 100) {
					hundredsTracker = hundred;
					money = money - 100;
					hundred--;
				}
			}
			if (money / 50 >= 0) {
				while (fifty > 0 && money >= 50) {
					fiftiesTracker = fifty;
					money = money - 50;
					fifty--;
				}
			}
			if (money / 20 >= 0) {
				while (twenty > 0 && money >= 20) {
					twentysTracker = twenty;
					money = money - 20;
					twenty--;
				}
			}
			if (money / 10 >= 0) {
				while (ten > 0 && money >= 10) {
					tensTracker = ten;
					money = money - 10;
					ten--;
				}
			}
			if (money / 5 >= 0) {
				while (five > 0 && money >= 5) {
					fivesTracker = five;
					money = money - 5;
					five--;
				}
			}
			if (money / 1 >= 0) {
				while (one > 0 && money >= 1) {
					onesTracker = one;
					money = money - 1;
					one--;
				}
			}
			if (money == 0) {
				System.out.println("Success: Dispensed $" + ogMoney);
				System.out.println("Machine balance: ");
				System.out.println("$100 - " + hundred);
				System.out.println("$50 - " + fifty);
				System.out.println("$20 - " + twenty);
				System.out.println("$10 - " + ten);
				System.out.println("$5 - " + five);
				System.out.println("$1 - " + one);
			} else {
				System.out.println("Failure: insufficient funds");
				hundred = hundredsTracker;
				fifty = fiftiesTracker;
				twenty = twentysTracker;
				ten = tensTracker;
				five = fivesTracker;
				one = onesTracker;
			}

		}
	}
}
