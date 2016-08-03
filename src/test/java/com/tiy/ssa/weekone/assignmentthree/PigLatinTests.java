package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class PigLatinTests {

	@Test
	public void test() {
		assertEquals("appyhay", new PigLatin("happy").translate());
		assertEquals("igpay", new PigLatin("pig").translate());
		assertEquals("ouldshay", new PigLatin("should").translate());
		assertEquals("appleway", new PigLatin("apple").translate());
	}

}
