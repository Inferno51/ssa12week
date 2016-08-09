package com.tiy.ssa.weektwo.day1.prework;

public class ParkingLot {
	
	public static void main(String[] args){
		
		Car JonsCar = new Car(7, 3, true, "Scion", "tc", "gray", false);
		
		System.out.println("Does the car run? " + JonsCar.isRuns());
		System.out.println("What color is the car? " + JonsCar.getColor());
		System.out.println("How many doors does the car have? " + JonsCar.getDoors());
		System.out.println("What make is the car? " + JonsCar.getMake());
		System.out.println("What model is the car? " + JonsCar.getModel());
		System.out.println("Is the car currently running? " + JonsCar.isCurrentlyRunning());
		
		JonsCar.setRuns(false);
		System.out.println("");
		System.out.println("Does the car run? " + JonsCar.isRuns());
		
	}
}
