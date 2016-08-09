package com.tiy.ssa.weektwo.day2.prework;

public class Motorcycle extends Vehicle{
	
	private boolean sidecar = false;

	public Motorcycle(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats, int wheels,
			boolean sidecar) {
		super(running, color, condition, fueledUp, numberOfSeats, wheels);
		this.sidecar = sidecar;
	}

	public void doWeHaveASidecar() {
		if (sidecar) {
			wheels += 1;
			numberOfSeats += 1;
		}
	}
}
