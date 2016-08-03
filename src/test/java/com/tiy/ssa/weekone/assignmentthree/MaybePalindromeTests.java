package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTests {

	@Test
	public void test() {
		
		assertTrue(new MaybePalindrome("Racecar").verification());
		//assertTrue(new MaybePalindrome("Jon").verification());  //this test should fail
		assertFalse(new MaybePalindrome("Jon").verification());
	}
}
