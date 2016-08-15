package com.tiy.ssa.weekthree.day1.assignment;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


public class CountriesApp {
	static Path countriesPath = Paths.get("\\Users\\admin\\workspace\\SSA12week\\src\\main\\java\\com\\tiy\\ssa\\weekthree\\day1\\assignment\\myCountries.txt");
	static File countriesFileObj = countriesPath.toFile();
	static boolean stillRunning = true; 
	static int optionChosen = 0;
	static Scanner sc = new Scanner(System.in);
	static Scanner country = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (stillRunning) {
			mainMenu(); //Calls the main menu method.
		}
		
	} //main
	
	public static void mainMenu() {
		
		// This method contains the primary logic for the main menu. 
		boolean userFailed = false;
		
		do {
			
			System.out.println("Hello! Welcome to the List of Countries!\n" 
					+ "1. Show a list of Countries.\n" 
					+ "2. Add a new country to the list.\n" 
					+ "3. Exit.");
			String userChoice = sc.nextLine();
			
			
			userFailed = UserValidation.menuOption(userChoice);
			optionChosen = Integer.parseInt(userChoice);
			
			
			if (optionChosen == 3) {
				exitProgram();
			} else if (optionChosen == 2) {
				addCountry();
			} else if (optionChosen == 1) {
				listCountries();
			}
			
		} while (userFailed);
	
		
	} // mainMenu
	
	public static void exitProgram(){
		// Note: This is option #3 in the menu. This exits the app. 
		System.exit(0);
	}
	
	public static void addCountry(){
		
		// Note: This is option #2 in the menu. This adds a country to the list. 
		System.out.println("Please type the name of a country to add: \n");
		String countryInput = country.next();
		try (
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFileObj, true)))) {	
				
				out.println(countryInput);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	} // addCountry
	
	public static void listCountries(){
		// Note: This is option #1 in the menu. This displays all countries in the file. 
		System.out.println("List of Countries");
		
		try(BufferedReader in = new BufferedReader(new FileReader(countriesFileObj))) {
			String countryToDisplay;
			
			while ((countryToDisplay = in.readLine()) != null) {
				System.out.println(countryToDisplay);
				
			}
			
		}catch (IOException f) {
			f.printStackTrace();
		}
		
	} // listCountries 
	

}// countriesApp
