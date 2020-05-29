package randomNumbers;

import java.util.Random;

public class flipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 0;
		int num = 0;
		int trial = 0;
		int heads = 0;
		int maxHeads = 0;
		int minHeads = 1000001;
		double max = 1000000;
		while (trial <= max) {

			while (count <= 10000) {
				num = generator.nextInt(2 - 1 + 1) + 1;
				if (num == 1) {
					heads++;
				}

				count++;

			}
			if (heads > maxHeads) {
				maxHeads = heads;
			}
			if (heads < minHeads) {
				minHeads = heads;
			}
			heads = 0;
			trial++;

		}
		System.out.println("The max percentage of heads was " + (maxHeads / max * 100));
		System.out.println("The min percentage of heads was " + (minHeads / max * 100));
	}
}
