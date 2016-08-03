package com.tiy.ssa.weekone.assignmenttwo;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class PrecisionBatteryTests {
	/*
	@Test
	public void dischargeTest() {
		BigDecimal testDifference = new BigDecimal(40.00);
		BigDecimal testCapacity = new BigDecimal(100.00);
		BigDecimal testExpected = new BigDecimal(60);
		
		assertEquals(testExpected, new PrecisionBattery(testCapacity).dischargeBattery(testDifference));
	}
	*/
	
	@Test
	public void chargeTestBasic() {
		BigDecimal testDifference = new BigDecimal(40.00);
		BigDecimal testCapacity = new BigDecimal(100.00);
		BigDecimal testExpected = new BigDecimal(60);
		
		PrecisionBattery one = new PrecisionBattery(testCapacity);
		assertEquals(testExpected, one.dischargeBattery(testDifference));
		assertEquals(new BigDecimal(80), one.chargeBattery(new BigDecimal(20)));
		assertEquals(new BigDecimal(50), one.dischargeBattery(new BigDecimal(30)));
	}
}
