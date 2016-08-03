package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatteryTests {

	@Test
	public void chargeTest() {
		assertEquals(100, new Battery(100).chargeBattery(20),0.01);
	}
	
	@Test
	public void dischargeTest() {
		assertEquals(10, new Battery(100).dischargeBattery(90),0.01);
	}
	
	@Test
	public void perHour() {
		assertEquals(3000, new Battery(100).timeRemaining(2),0); 
	}

	@Test
	public void getAndSet() {
		Battery one = new Battery(100F);
		assertEquals(70, one.dischargeBattery(30),0.01);
		assertEquals(80, one.chargeBattery(10),0.01);
		assertEquals(2400, one.timeRemaining(2),0);
		one.getCapacity();
		one.getRemaining(); 
	}
}

