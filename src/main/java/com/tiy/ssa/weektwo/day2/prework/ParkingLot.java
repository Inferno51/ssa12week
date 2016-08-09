package com.tiy.ssa.weektwo.day2.prework;

public class ParkingLot {
	
	public static void main(String[] args) {
		EighteenWheeler megatron = new EighteenWheeler(true, "white", "battle-hardened", true, 2, 10, true, "honk honk");
		Motorcycle rocket = new Motorcycle(true, "red", "good", true, 1, 2, true);
		
		System.out.println("The motorcycle has " + rocket.getNumberOfSeats() + " seats.");
		System.out.println("Lets add a side-car!");
		rocket.doWeHaveASidecar();
		System.out.println("The motorcycle now has " + rocket.getNumberOfSeats() + " seats.");
		
		System.out.println("Megatron is " + megatron.getCondition() + " and ready to take down the Autobots!");
		
	}
	
	
}
