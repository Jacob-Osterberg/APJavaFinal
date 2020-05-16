package randomNumbers;

import java.util.Random;

public class activityThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 0;
		int num = 0;
		int total = 0;
		while (count <= 248) {
			num = generator.nextInt(43 - 26 + 1) + 26;
			if (num > 36) {
				total++;
			}
			count++;

		}
		System.out.println(total);

	}

}
