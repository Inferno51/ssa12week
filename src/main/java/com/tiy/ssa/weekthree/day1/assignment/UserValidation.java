package com.tiy.ssa.weekthree.day1.assignment;

public class UserValidation {
	
	 public static boolean menuOption(String userChoice) {

	       try {

	           int isValid = Integer.parseInt(userChoice);
	           if ((isValid < 0) || (isValid > 3)) {
	               System.out.println("You did not enter a valid choice. Please input only numbers between 1 and 3!");
	        	   return true;
	           }
	           
	           return false;
	       }

	       catch (NumberFormatException e) {
	    	   return true;
	       }

	 }
}