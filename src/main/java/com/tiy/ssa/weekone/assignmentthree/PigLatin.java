package com.tiy.ssa.weekone.assignmentthree;

public class PigLatin {
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
}

