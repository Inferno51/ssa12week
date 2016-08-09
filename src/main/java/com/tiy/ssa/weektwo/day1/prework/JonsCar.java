package com.tiy.ssa.weektwo.day1.prework;

public class JonsCar {
	
	private int windows = 8;
	private int doors = 5;
	private boolean runs = true;
	private String make = "Scion";
	private String model = "tC";
	private String color = "gray";
	private boolean currentlyRunning = false;
	
	public JonsCar(int windows, int doors, boolean runs, String make, String model, String color,
			boolean currentlyRunning) {

		this.windows = windows;
		this.doors = doors;
		this.runs = runs;
		this.make = make;
		this.model = model;
		this.color = color;
		this.currentlyRunning = currentlyRunning;
	}

	public JonsCar() {
		
	}

	public int getWindows() {
		return windows;
	}

	public int getDoors() {
		return doors;
	}

	public boolean isRuns() {
		return runs;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public boolean isCurrentlyRunning() {
		return currentlyRunning;
	}
	
	
	
}
