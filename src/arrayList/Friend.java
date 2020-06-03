package arrayList;

public class Friend {

	String name;
	int age;

	public Friend() {
		age = 1;
		name = "bill";
	}

	public Friend(int inputAge, String inputName) {
		age = inputAge;
		name = inputName;
	}

	public String getName() {
		return name;
	}

	public void setName(String inputName) {
		name = inputName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int inputAge) {
		age = inputAge;
	}

}
