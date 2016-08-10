package com.tiy.ssa.weektwo.day3.objectdesign;

import java.util.Scanner;

public class RoboticsFactory {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		userInputMethod();
	}
	
	public static void userInputMethod (){
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		Scanner scanFloat = new Scanner(System.in);
		String robotBehavior = null;
		String robotName = null; 
		String userInput = null; 
		String temp = null; 
		int robotPart = 0;
		boolean robotYN = false;
		boolean userFailed = false;
		float robotSize = 0.00f;
		
		
		System.out.println("Welcome to RobCo Robot Manufacturing!");
		Android robot001 = new Android();
		
		// Prompts for the name of the robot.
		System.out.println("Please input a name for your new robot!");
		robotName = scan.nextLine();
		robot001.setName(robotName); 
		
		// Prompts for the number of heads the robot should have.
		System.out.println("Please input the number of head modules the robot needs to have: ");
		robotPart = sc.nextInt();
		robot001.setNumHeads(robotPart);
				
		// Prompts for the number of arms the robot should have.
		System.out.println("Please input the number of arm fittings the robot must have: ");
		robotPart = sc.nextInt();
		robot001.setNumArms(robotPart);
		
		// Prompts for the number of legs the robot should have.
		System.out.println("Please input the number of leg fittings the robot must have: ");
		robotPart = sc.nextInt();
		robot001.setNumLegs(robotPart);
		
		
		/* Prompts for the user to select whether the robot should have an infrared scanner. 
		 * If you enter y, then infraredScanner is true. */ 
		System.out.println("Do you wish for the robot to have an infrared scanner? Please input Y or N: ");
		userInput = scan.nextLine().toLowerCase();
		if (userInput.startsWith("y")) {
			robotYN = true;
		}
		robot001.setInfraredScanner(robotYN);
		robotYN = false;
		
		System.out.println("Do you wish for the robot to have a geiger counter? Please input Y or N: ");
		userInput = scan.nextLine().toLowerCase();
		if (userInput.startsWith("y")) {
			robotYN = true;
		}
		robot001.setGeigerCounter(robotYN);
		robotYN = false;
		
		System.out.println("Do you wish for the robot to have a laser cannon? Please input Y or N: ");
		userInput = scan.nextLine().toLowerCase();
		if (userInput.startsWith("y")) {
			robotYN = true;
		}
		robot001.setWeapons(robotYN);
		robotYN = false; 
		
		System.out.println("Please input the height the robot must be: ");
		robotSize = scanFloat.nextFloat();
		robot001.setHeight(robotSize);
		
		System.out.println("Please input the width the robot must be: ");
		robotSize = scanFloat.nextFloat();
		robot001.setWidth(robotSize);
		
		System.out.println("Please input the depth the robot must be: ");
		robotSize = scanFloat.nextFloat();
		robot001.setDepth(robotSize);
		
		System.out.println("Finally, should your robot be aggressive or passive?");
		robotBehavior = scan.nextLine();
		robot001.setBehavior(robotBehavior);
		
		
		System.out.println(robot001.toString());
	}
	
}
