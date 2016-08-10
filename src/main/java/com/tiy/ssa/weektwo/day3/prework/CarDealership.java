package com.tiy.ssa.weektwo.day3.prework;

import java.util.Scanner;

public class CarDealership {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInputB = null;
		int carPart = 0;
		boolean userFailed = false;
		
		Car ourSweetCar = new Car();

		
			System.out.println("Welcome to the Car Dealership!");
			System.out.println("What kind of car are you looking for?");
			String userInputA = sc.nextLine();
			
		do {
			System.out.println("How many doors would you like?");
			userInputB = sc.nextLine();

			userFailed = numberIsValid(userInputB);

		} while (userFailed);
		
		carPart = Integer.parseInt(userInputB);
		
		ourSweetCar.setDoors(carPart);
		
		do {
			userFailed = false;
			
			System.out.println("How many windows would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		carPart = Integer.parseInt(userInputB);
		
		ourSweetCar.setWindows(carPart);
		
		do {
			userFailed = false;
			
			System.out.println("How many seats would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		carPart = Integer.parseInt(userInputB);
		
		ourSweetCar.setSeats(carPart);
		
		do {
			userFailed = false;
			
			System.out.println("How many wheels would you like?");
			userInputB = sc.nextLine();
			
			 userFailed = numberIsValid(userInputB);
			
			
		} while (userFailed);

		
		carPart = Integer.parseInt(userInputB);
		
		ourSweetCar.setWheels(carPart);
		
		System.out.println(ourSweetCar.toString());
		System.out.println("Actually I have a " + userInputA + " that looks just like that");
		
	} // main
	
	public static boolean numberIsValid(String someStringToMakeANumber) {

		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
			
		} catch (NumberFormatException e) {
			return true;
		}

	}

} // class