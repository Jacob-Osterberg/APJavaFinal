package strings;

import java.util.Scanner;

public class Essay {
	Scanner input = new Scanner(System.in);
	private String name;
	private String text;
	private String nameUpper;
	private int nameL;
	private boolean nameC;

	public Essay() {
		name = "Bob Bobson";
		text = "Bob went to the store";

	}

	public String getName() {
		return name;
	}

	public void setName(String xname) {
		name = xname;
	}

	public String getText() {
		return text;
	}

	public void setText(String xText) {
		text = xText;
	}

	public String getNameUpper() {
		return nameUpper;
	}

	public void setNameUpper(String nameUpper) {
		this.nameUpper = nameUpper;
	}

	public int getNameL() {
		return nameL;
	}

	public void setNameL(int nameL) {
		this.nameL = nameL;
	}

	public boolean getNameC() {
		return nameC;
	}

	public void setNameC(boolean nameY) {
		nameC = nameY;
	}

	public String capital() {
		String nameUpper = name.toUpperCase();
		return nameUpper;
	}

	public int nameLength() {
		nameL = name.length();
		return nameL;
	}

	public boolean correct() {
		if (((name.indexOf("X") + 1) == 2)) {
			nameC = true;
			return nameC;
		} else {
			nameC = false;
			return nameC;
		}

	}

	public int textLenght() {
		int count = 0;
		for (count = 0; count < text.length(); count++) {
			if (text.charAt(count) != ' ') {
			}

		}
		return count;

	}
}
