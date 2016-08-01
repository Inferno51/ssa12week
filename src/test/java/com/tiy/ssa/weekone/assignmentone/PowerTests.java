package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTests {

	@Test
	public void test() {
		assertEquals("", 1, new Power(1).returnSelf());
	}
	
	@Test
	public void testSquared() {
		assertEquals("", 1, new Power(1).returnSquared());
		assertEquals("", 4, new Power(2).returnSquared());
		assertEquals("", 9, new Power(3).returnSquared());
		assertEquals("", 16, new Power(4).returnSquared());
		assertEquals("", 25, new Power(5).returnSquared());
	}
	
	@Test
	public void testCubed() {
		assertEquals("", 1, new Power(1).returnCubed());
		assertEquals("", 8, new Power(2).returnCubed());
		assertEquals("", 27, new Power(3).returnCubed());
		assertEquals("", 64, new Power(4).returnCubed());
		assertEquals("", 125, new Power(5).returnCubed());
	}
}
