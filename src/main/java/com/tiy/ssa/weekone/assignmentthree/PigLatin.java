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
		String input = sc.nextLine().toLowerCase();
		String[] sentance = input.split("\\W+");
		
		for (int i=0; i<sentance.length; i++) {
			temp=temp.concat(translate(sentance[i]));
			System.out.print(translate(sentance[i]));
		}
		
		sc.close();
		return temp=temp.substring(0, temp.length()-1);
	}
	
	public static String translate(String word) {
		String vowels = "aeiou";
		int vowelPosition = vowels.indexOf(word.charAt(0));
		int wordLength = word.length();
		boolean firstLetterVowel = (vowelPosition >= 0);
		
		if (firstLetterVowel) {
			return word = (word + "way ");
		} else if (wordLength == 1) {
			return word = (word + "way ");
		} else if (word.charAt(1) != 'a' && word.charAt(1) != 'e' && word.charAt(1) != 'i' && word.charAt(1) != 'o' && word.charAt(1) != 'u'){
			String twoConsWord = word.substring(2);
			return word = (twoConsWord + word.charAt(0) + word.charAt(1) + "ay ");
		} else {
			String restOfWord = word.substring(1);
			return word = (restOfWord + word.charAt(0) + "ay ");
		}
	}
}


