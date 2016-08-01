package com.tiy.ssa.weekone.assignmentone;

public class Power {
	//Declaration of initial variable
	final int initial;
	
	//Constructor
	public Power(int initial){
		this.initial=initial;
	}
	
	
	public int returnSelf() {
		return this.initial;
	}
	
	public int returnSquared() {
		return this.initial*this.initial;
	}
	
	public int returnCubed() {
		return returnSquared()*this.initial;
	}
	
}
