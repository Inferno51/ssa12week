package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTests {

	@Test
	public void chargeTest() {
		assertEquals(90, new Battery(100).chargeBattery(70,20),0);
	}
	
	@Test
	public void dischargeTest() {
		assertEquals(0, new Battery(100).dischargeBattery(70,90),0);
		assertEquals(50, new Battery(100).dischargeBattery(70, 30), 0);
	}

}
