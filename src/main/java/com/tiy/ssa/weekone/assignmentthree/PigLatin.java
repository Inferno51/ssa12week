package com.tiy.ssa.weekone.assignmentthree;

import java.util.Scanner;

public class PigLatin {
	
	public static void main (String[] args) {
		splitWords();	
	}
	
	public static String splitWords() {
		String temp = "";
		System.out.println("Please enter the phrase to translate:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] sentance = input.split("\\W+");
		
		for (int i=0; i<sentance.length; i++) {
			temp=temp.concat(translate(sentance[i]));
			System.out.print(translate(sentance[i]));
		}
		
		sc.close();
		return temp=temp.substring(0, temp.length()-1);
	}
	
	public static String translate(String word) {
		char firstChar = word.charAt(0);
		char secondChar = word.charAt(1);
		String vowels = "aeiou";
		int vowelPosition = vowels.indexOf(firstChar);
		boolean firstLetterVowel = (vowelPosition >= 0);
		
		if (firstLetterVowel) {
			return word = (word + "way ");
		} else if (secondChar != 'a' && secondChar != 'e' && secondChar != 'i' && secondChar != 'o' && secondChar != 'u'){
			String twoConsWord = word.substring(2);
			return word = (twoConsWord + firstChar + secondChar + "ay ");
		} else {
			String restOfWord = word.substring(1);
			return word = (restOfWord + firstChar + "ay ");
		}
	}
}
	
	
	/*
	String word;
	String[] splits; 
	
	public PigLatin(String word) {
		// Initial constructor, and converts passed in word to lower case.
		this.word = word.toLowerCase();
	}
	
	public String translate() {
		char firstChar = word.charAt(0);		//The first letter.
		char secondChar = word.charAt(1);		//The second letter.

		String vowels = "aeiou";				//Defines what are vowels.
		
		int vowelPosition = vowels.indexOf(firstChar);
		boolean firstLetterVowel = (vowelPosition >= 0);
		
		if (firstLetterVowel) {
			return (word + "way");
		} else if (secondChar != 'a' && secondChar != 'e' && secondChar != 'i' && secondChar != 'o' && secondChar != 'u'){
			String twoConsWord = word.substring(2);
			return (twoConsWord + firstChar + secondChar + "ay");
		} else {
			String restOfWord = word.substring(1);
			return (restOfWord + firstChar + "ay");
		}
	}
	*/


