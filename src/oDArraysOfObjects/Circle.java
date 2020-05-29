package oDArraysOfObjects;

public class Circle {
	private double radius;

	public Circle() {
		setRadius(10);
	}

	public Circle(int newRadius) {
		if (newRadius > 0)
			setRadius(newRadius);
		else
			setRadius(10);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

}
