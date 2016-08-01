package com.tiy.ssa.weekone.assignmentone;

public class Thermometer {
	int temperature;
	boolean isFahrenheit;
	
	public Thermometer(int temperature){
		this(temperature, true);
	}
	
	public Thermometer(int temperature, boolean isFahrenheit){
		this.temperature=temperature;
		this.isFahrenheit=isFahrenheit;
	}
	
	public int display(boolean wantFahrenheit){
		if (wantFahrenheit == this.isFahrenheit) {
			return Math.round(this.temperature);
		} else if (isFahrenheit == true && wantFahrenheit == false) {
			return Math.round((5*(this.temperature-32))/9);
		} else {
			return Math.round(((9*this.temperature)/5)+32);
		}
	}
}
