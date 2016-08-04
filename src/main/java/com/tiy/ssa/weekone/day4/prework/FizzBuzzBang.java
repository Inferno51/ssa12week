package com.tiy.ssa.weekone.day4.prework;

public class FizzBuzzBang {

	public static void main(String[] args) {
		for (int i = 1; i < 110; i++){
			if (divisableByAllThree(i)) {
				System.out.println("FizzBuzzBang");
			} else if (divisableByThreeAndFive(i)) {
				System.out.println("FizzBuzz");
			} else if (divisableByThreeAndSeven(i)) {
				System.out.println("FizzBang");
			} else if (divisableByFiveAndSeven(i)) {
				System.out.println("BuzzBang");
			} else if (divisableByOnlyThree(i)) {
				System.out.println("Fizz");
			} else if (divisableByOnlyFive(i)) {
				System.out.println("Buzz");
			} else if (divisableByOnlySeven(i)) {
				System.out.println("Bang");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public static boolean divisableByAllThree(int fromTheForLoop){
		
		boolean howsThis = false; 
		
		if (((fromTheForLoop % 3)==0) && ((fromTheForLoop % 5)==0) && ((fromTheForLoop % 7)==0)){
			howsThis = true;
		} 
		return howsThis; 
	}
	
	public static boolean divisableByThreeAndFive(int fromTheForLoop) {
		
		boolean howsThis = false; 
		
		if (((fromTheForLoop % 3)==0) && ((fromTheForLoop % 5)==0)) {
			howsThis = true;
		}
		return howsThis;
	}
	
	public static boolean divisableByThreeAndSeven (int fromTheForLoop) {
		
		boolean howsThis = false;
		
		if (((fromTheForLoop % 3)==0) && ((fromTheForLoop % 7)==0)) {
			howsThis = true;
		}
		
		return howsThis;
	}
	
	public static boolean divisableByFiveAndSeven (int fromTheForLoop) {
		
		boolean howsThis = false;
		
		if (((fromTheForLoop % 5)==0) && ((fromTheForLoop % 7)==0)) {
			howsThis = true;
		}
		
		return howsThis;
	}
	
	public static boolean divisableByOnlyThree(int fromTheForLoop) {
		
		boolean howsThis = false;
		
		if ((fromTheForLoop % 3)==0) {
			howsThis = true; 
		}
		
		return howsThis;
	}
	
	public static boolean divisableByOnlyFive(int fromTheForLoop) {
		
		boolean howsThis = false;
		
		if ((fromTheForLoop % 5)==0) {
			howsThis = true; 
		}
		
		return howsThis;
	}
	
	public static boolean divisableByOnlySeven(int fromTheForLoop) {
		
		boolean howsThis = false;
		
		if ((fromTheForLoop % 7)==0) {
			howsThis = true; 
		}
		
		return howsThis;
	}
}
