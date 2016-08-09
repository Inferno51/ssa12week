package com.tiy.ssa.weektwo.day1.prework;

// import java.util.ArrayList;
import java.util.Scanner;

public class BattingAverage {
	
	public static void main(String[] args) {
		//run the method that performs the calculation and displays the result.
		userInput();
		
		
	}
	
	public static int userInput() {
		//method for asking the user to input data
		// int temp = 0;
		BaseballPlayer player1 = new BaseballPlayer();
		
		System.out.println("Please enter the player's name:");
		Scanner scName = new Scanner(System.in);
		String inputName = scName.nextLine();
		player1.setBatterName(inputName);
		
		System.out.println("Please enter the number of at batt times: ");
		Scanner scInt = new Scanner(System.in);
		int intNum = scInt.nextInt();
		player1.setAtBats(intNum);
		
		
		for (int i = 0; i < player1.getAtBats(); i++) {
			System.out.println("Enter their bases batted (0, 1, 2, 3, or 4):");
			intNum = scInt.nextInt();
			if (intNum == 4) {
				player1.setHomeRuns(1);
			} else if (intNum == 3) {
				player1.setTriples(1);
			} else if (intNum == 2) {
				player1.setDoubles(1);
			} else if (intNum == 1) {
				player1.setSingles(1);
			} else if (intNum == 0) {
				player1.setOuts(1);
			} else {
				System.out.println("You didn't enter a valid number of bases.");
			}
			
			
			System.out.println("Number of home runs: " + player1.getHomeRuns());
			System.out.println("Number of triples: " + player1.getTriples());
			System.out.println("Number of doubles: " + player1.getDoubles());
			System.out.println("Number of singles: " + player1.getSingles());
			System.out.println("Number of outs: " + player1.getOuts());
		}
		
		System.out.println("The number of at batt times you entered: " + player1.getAtBats());
		System.out.println("The player's name is: " + player1.getBatterName());
		System.out.println("The batting average of the player is: " + player1.setBattingAverage());
		System.out.println("The slugging average of the player is: " + player1.setSluggingAverage());
		scName.close();
		scInt.close();
		
		return intNum;
				
	}

	//public static int calcBattingAvg(){
		
	// }
}
