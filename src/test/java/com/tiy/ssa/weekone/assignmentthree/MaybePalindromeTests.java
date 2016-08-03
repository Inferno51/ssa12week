package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTests {

	@Test
	public void test() {
		
		assertEquals(true, new MaybePalindrome("Racecar").verification());
		assertEquals(true, new MaybePalindrome("Jon").verification());  //this test should fail
		
	}
}
