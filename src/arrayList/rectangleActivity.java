package arrayList;

import java.util.ArrayList;
import java.util.Random;

public class rectangleActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int count = 0;
		int i = 0;
		int j = 0;
		double largest = 0;
		double smallest = 9999;
		int t = 0;
		int y = 0;
		double tempWidth = 0;
		double tempLength = 0;
		double tempWidth2 = 0;
		double tempLength2 = 0;

		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

		for (count = 0; count < 20; count++) {
			i = generator.nextInt(50 - 1 + 1) + 1;
			j = generator.nextInt(50 - 1 + 1) + 1;
			rectangles.add(new Rectangle(i, j));

		}

		for (count = 0; count < rectangles.size(); count++) {
			if (rectangles.get(count).area() > largest) {
				largest = rectangles.get(count).area();
				t = count;
			}
		}
		for (count = 0; count < rectangles.size(); count++) {
			if (rectangles.get(count).area() < smallest) {
				smallest = rectangles.get(count).area();
				y = count;
			}
		}

		tempWidth = rectangles.get(t).getWidth();
		tempLength = rectangles.get(t).getLength();
		rectangles.remove(t);
		rectangles.add(0, new Rectangle(tempLength, tempWidth));

		tempWidth2 = rectangles.get(y).getWidth();
		tempLength2 = rectangles.get(y).getLength();
		rectangles.remove(y);
		rectangles.add((rectangles.size() - 1), new Rectangle(tempLength2, tempWidth2));

		for (i = 0; i < rectangles.size(); i++) {

			System.out.println("Area: " + rectangles.get(i).area());

		}

	}

}
