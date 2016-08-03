package com.tiy.ssa.weekone.assignmentthree;

public class PigLatin {
	String word;
	String[] splits; 
	
	public PigLatin(String word) {
		// Initial constructor, and converts passed in word to lower case.
		this.word = word.toLowerCase();
	}
	
	public void splitArray() {
		splits = word.split("\\s+");
		for (int i = 0; i < splits.length; i++) {
			splits[i] = splits[i].replaceAll("^\\w]", "");
		}
		
		for (int j = 0; j < splits.length; j++) {
			System.out.println(translate(splits[j]));
		}
	}
	
	public String translate(String s) {
		char firstChar = s.charAt(0);		//The first letter.
		char secondChar = s.charAt(1);		//The second letter.
		String vowels = "aeiou";				//Defines what are vowels.
		
		int vowelPosition = vowels.indexOf(firstChar);
		boolean firstLetterVowel = (vowelPosition >= 0);
		
		if (firstLetterVowel) {
			return (s + "way");
		} else if (secondChar != 'a' && secondChar != 'e' && secondChar != 'i' && secondChar != 'o' && secondChar != 'u'){
			String twoConsWord = s.substring(2);
			return (twoConsWord + firstChar + secondChar + "ay");
		} else {
			String restOfWord = s.substring(1);
			return (restOfWord + firstChar + "ay");
		}
	}
	
	/*
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
	
	public void sentance(String sentance) {
		for (int i = 0; i < sentance.length(); i++) {
			System.out.println("blah");
		}
	}
}

