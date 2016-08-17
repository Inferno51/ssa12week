package com.tiy.ssa.exam;

public class Car extends Vehicle{
	
	// Variable declarations for state of Car.
	boolean isRunning = false; 	// state
	boolean isParked = true; 	// state
	boolean isDamaged = false;	// state
	boolean isLeased = true; 	// state
	boolean isOwned = false;	// state
	
	// Constructor for Car.
	public Car(boolean runs, boolean fueled, int numWheels, boolean isRunning, boolean isParked, boolean isDamaged,
			boolean isLeased, boolean isOwned) {
		super(runs, fueled, numWheels);
		this.isRunning = isRunning;
		this.isParked = isParked;
		this.isDamaged = isDamaged;
		this.isLeased = isLeased;
		this.isOwned = isOwned;
	}

	// Blank constructor for Car.
	public Car() {
	}
	
	// Behavior method for speeding up.
	public void accelerate(){
		System.out.println("Speeding up! Woo!");
	}
	
	// Behavior method for slowing down.
	public void decelerate(){
		System.out.println("Slowing down! Lame.");
	}
	
	
	// Inherited methods from super class Vehicle.
	@Override
	public void turnOnCar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fuelCar() {
		// TODO Auto-generated method stub
		
	}

	
	// Getters and Setters.
	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public boolean isParked() {
		return isParked;
	}

	public void setParked(boolean isParked) {
		this.isParked = isParked;
	}

	public boolean isDamaged() {
		return isDamaged;
	}

	public void setDamaged(boolean isDamaged) {
		this.isDamaged = isDamaged;
	}

	public boolean isLeased() {
		return isLeased;
	}

	public void setLeased(boolean isLeased) {
		this.isLeased = isLeased;
	}

	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}
	
	
	
}
