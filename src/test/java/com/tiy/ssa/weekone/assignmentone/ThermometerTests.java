package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTests {

	@Test
	public void test() {
		assertEquals("", 78, new Thermometer(78).display(true));
		assertEquals("", 78, new Thermometer(78, false).display(false));
	}
	
	@Test
	public void FtoC() {
		assertEquals("", 100, new Thermometer(212).display(false));
	}
	
	@Test
	public void CtoF() {
		assertEquals("", 212, new Thermometer(100,false).display(true));
	}
}
