package com.tiy.ssa.weektwo.day2.prework;

public class EighteenWheeler extends Vehicle {

	boolean trailer = true;
	String horn = "honk honk";

	

	public EighteenWheeler(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats,
			int wheels, boolean trailer, String horn) {
		super(running, color, condition, fueledUp, numberOfSeats, wheels);
		this.trailer = trailer;
		this.horn = horn;
	}

	public void withoutATrailer(){
		if (!(trailer)) {
			wheels = 10;
		}
	}
	
	public void honkHorn() {
		System.out.println(horn);
	}
}
