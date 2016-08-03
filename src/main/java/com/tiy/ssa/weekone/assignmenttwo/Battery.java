package com.tiy.ssa.weekone.assignmenttwo;

/* 
 * 
 * @author Jonathan 
 */

public class Battery {
	//in kWh
	final float capacity;
	//in kWh
	float leftOver;
	//in kWh
	float power; //num. of kW used per hour
	float time; // in minutes
	
	public Battery(float capacity) {
		this.capacity = capacity;
		this.leftOver = capacity;
	}
	
	public float chargeBattery(float difference){
		if ((this.leftOver+difference) > capacity) {
			this.leftOver = capacity;
			return this.leftOver;
		} else {
			this.leftOver += difference;
			return this.leftOver; 
		}
	}
	
	public float dischargeBattery(float difference){
		if (this.leftOver - difference <= 0) {
			this.leftOver = 0;
			return this.leftOver;
		} else {
			this.leftOver -= difference;
			return this.leftOver;
		}
	}
	
	public int timeRemaining(float power) {
		return Math.round((this.leftOver/power)*60); //This returns the remaining charge life in minutes.
	}
	
	public void getCapacity() {
		System.out.println("Total capacity: " + this.capacity);
	}
	
	public void getRemaining() {
		System.out.println("Remaining charge: " + this.leftOver);
	}
}
