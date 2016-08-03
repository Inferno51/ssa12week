package com.tiy.ssa.weekone.assignmentthree;


public class MaybePalindrome {
	String word;
	char[] chars;
	int length;
	
	public MaybePalindrome(String word) {
		this.word = word.toLowerCase();
		this.length = word.length();
	}
	
	public boolean verification() {
		chars = new char[word.length()];
		for (int i = length - 1; i>=0; i--)
			chars[i] = word.charAt(i);
		
		for (int j = length - 1; j>=0; j--) {
			if (chars[j] != chars[chars.length-1-j]) {
				System.out.println(word + " is not a palindrome.");
				return false;
			} 
		} 
		System.out.println(word + " is a palindrome! Congratulations!");
		return true;
	}	
	
}
