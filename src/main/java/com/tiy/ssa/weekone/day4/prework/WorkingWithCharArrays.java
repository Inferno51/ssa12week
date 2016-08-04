package com.tiy.ssa.weekone.day4.prework;

import java.util.Scanner;

public class WorkingWithCharArrays {
	
	public static void main(String[] args) {
		
		
		
		/* =][= Commented out for reference. =][=
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
				 
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
			
		StringBuilder modUserInput = new StringBuilder(userInput);
		
		String firstLetter = modUserInput.substring(0,1);
		StringBuilder remainingWord = modUserInput.deleteCharAt(0);
		
		
		System.out.println(firstLetter);
		System.out.println(remainingWord);
	
		Scanner alien = new Scanner(System.in);
		System.out.println("How is your day?");
		System.out.println("Is it great, bad, or wonderful?");
		String theDayIs = alien.nextLine();
		
		switch(theDayIs.toLowerCase()) {
		case "great":
			System.out.println("Great to hear!");
			break;
		case "bad":
			System.out.println("Sorry to hear that!");
			break;
		case "wonderful":
			System.out.println("That's wonderful!");
			break;
		default: 
			System.out.println("What?");
			break;
		
		int day = 0;
		for (int i = 0; i < 8; i++) {
			
			switch (day) {
			case 1:
				happyDay(day);
				break;
			case 2:
				happyDay(day);
			default:
				thatsNotADay(day);
				break;
			}
		}
		
		
		
		StringBuilder stuffNThings = new StringBuilder("Hi Jason");
		
		char[] sayHiClass = {'H','i',' ','c','l','a','s','s'};
		
		String sayingHiClass = new String(sayHiClass);
		
		System.out.println(sayingHiClass);
		
		String stuff = "Hi all";
		
		System.out.println(stuff.toLowerCase());
		System.out.println(stuffNThings.deleteCharAt(5));
		System.out.println(stuffNThings.deleteCharAt(4));
		
		System.out.println(stuffNThings + ", " + stuff);
		*/
	}
	/*
	private static void thatsNotADay(int day) {
		System.out.println("That's not a day!");
		
	}

	public static void happyDay(int day) {
		System.out.println("Happy day!");
	}
	*/
}
