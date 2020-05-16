package randomNumbers;

import java.util.Random;

public class activityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 0;
		int num = 0;

		while (count <= 100000) {
			num = generator.nextInt(2 - 1 + 1) + 1;
			if (num == 1) {
				System.out.println(count + " Heads");
			} else {
				System.out.println(count + " Tails");
			}
			count++;

		}

	}

}
