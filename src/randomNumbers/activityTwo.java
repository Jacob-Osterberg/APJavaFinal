package randomNumbers;

import java.util.Random;

public class activityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 0;
		int num = 0;
		int total = 0;
		while (count <= 87) {
			num = generator.nextInt(13 - 1 + 1) + 1;
			if (num % 3 == 0) {
				total++;
			}
			count++;

		}
		System.out.println(total);
	}
}
