package oDArraysOfObjects;

public class Car {
	private double mpg;
	private double capacity;
	private double fuel;
	private double odometer;

//Constructors
	public void CarClass() {
		mpg = 20;
		capacity = 20;
		fuel = 20;
		odometer = 0;
	}

	public void CarClass(double newMPG, double newCapacity, double newFuel, double newOdometer) {
		mpg = newMPG;
		capacity = newCapacity;
		fuel = newFuel;
		odometer = newOdometer;
	}

	// Accessor Methods
	public double getMPG() {
		return mpg;
	}

	public double getCapacity() {
		return capacity;
	}

	public double getFuel() {
		return fuel;
	}

	public double getOdometer() {
		return odometer;
	}

	public void setMPG(double newMpg) {
		mpg = newMpg;
	}

	public void setCapacity(double newCapacity) {
		capacity = newCapacity;
	}

	public void setFuel(double newFuel) {
		fuel = newFuel;
	}

	public void setOdometer(double newOdometer) {
		odometer = newOdometer;
	}

	public void fillTank(double gallonsAdded) {
		fuel = fuel + gallonsAdded;
	}

	public void driveCar(double milesTraveled) {
		fuel = fuel - (milesTraveled / mpg);
		odometer = odometer + milesTraveled;
	}
}
