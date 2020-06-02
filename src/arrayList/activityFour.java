package arrayList;

import java.util.ArrayList;

public class activityFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ages = 0;
		ArrayList<Friend> friends = new ArrayList<Friend>();
		friends.add(new Friend(16, "Bob"));
		friends.add(1, new Friend(4, "Jim"));
		friends.add(0, new Friend(20, "Tim"));
		for (int i = 0; i < friends.size(); i++) {
			ages = friends.get(i).getAge();
			System.out.println(ages);

		}

	}

}
