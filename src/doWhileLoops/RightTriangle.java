package doWhileLoops;

public class RightTriangle {
	private double base = -99.9;
	private double height = -99.9;

	public RightTriangle() {
		base = -99.9;
		height = -99.9;

	}

	public RightTriangle(double ybase, double yheight) {
		base = ybase;
		height = yheight;
	}

	public double getBase() {
		return base;

	}

	public void setBase(double xbase) {
		base = xbase;
	}

	public double getHeight() {
		return height;

	}

	public void setHeight(double xheight) {
		height = xheight;
	}

	public double hypotenuse() {
		double hypot = Math.sqrt(base * base + height * height);
		return hypot;
	}

	public double perimeter() {
		double hypot = this.hypotenuse();
		double perm = hypot + base + height;
		return perm;

	}

	public double area() {
		double area = base * height * .5;
		return area;
	}
}