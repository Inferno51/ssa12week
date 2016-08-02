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
	float difference;
	
	public Battery(float capacity) {
		this.capacity = capacity;
	}
	
	public float chargeBattery(float leftOver, float difference){
		if (leftOver+difference >= capacity) {
			return capacity;
		} else {
			return leftOver + difference; 
		}
	}
	
	public float dischargeBattery(float leftOver, float difference){
		if (leftOver - difference <= 0) {
			return 0;
		} else {
			return leftOver - difference;
		}
	}
	
}