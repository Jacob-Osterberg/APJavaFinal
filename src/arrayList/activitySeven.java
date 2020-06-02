package arrayList;

import java.util.ArrayList;

public class activitySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tempWidth = 0;
		double tempLength = 0;
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

		rectangles.add(new Rectangle());
		rectangles.add(1, new Rectangle(4, 5));
		rectangles.add(0, new Rectangle(20, 10));

		tempWidth = rectangles.get(rectangles.size() - 1).getWidth();
		tempLength = rectangles.get(rectangles.size() - 1).getLength();

		rectangles.remove(rectangles.size() - 1);

		rectangles.add(new Rectangle(tempLength, tempWidth));

		for (int i = 0; i < rectangles.size(); i++) {

			System.out
					.println("Length: " + rectangles.get(i).getLength() + ", width: " + (rectangles.get(i).getWidth()));

		}

	}

}
