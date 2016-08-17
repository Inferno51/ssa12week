package com.tiy.ssa.exam;

public abstract class Vehicle {
	
	// Variable declarations for super class Vehicle.
	protected boolean runs = true;
	protected boolean fueled = true;
	protected int numWheels = 4;
	
	// Constructor for Vehicle.
	public Vehicle(boolean runs, boolean fueled, int numWheels) {
		this.runs = runs;
		this.fueled = fueled;
		this.numWheels = numWheels;
	}

	// Blank constructor for Vehicle.
	public Vehicle() {
	}
	
	// Abstract methods for Car to inherit
	public abstract void turnOnCar();
	
	public abstract void fuelCar();

	public boolean isRuns() {
		return runs;
	}


	// Getters and Setters
	public void setRuns(boolean runs) {
		this.runs = runs;
	}


	public boolean isFueled() {
		return fueled;
	}


	public void setFueled(boolean fueled) {
		this.fueled = fueled;
	}


	public int getNumWheels() {
		return numWheels;
	}


	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	
	
}
