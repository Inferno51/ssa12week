package com.tiy.ssa.weekone.assignmenttwo;

import java.math.BigDecimal;

public class PrecisionBattery {
	final BigDecimal capacity;
	BigDecimal leftOver;
	BigDecimal power;
	BigDecimal isZero = new BigDecimal(0.00);
	int time; 
	
	
	public PrecisionBattery(BigDecimal capacity) {
		this.capacity = capacity;
		this.leftOver = capacity;
	}
	
	public BigDecimal dischargeBattery(BigDecimal difference){
		
		if (this.leftOver.subtract(difference).compareTo(BigDecimal.ZERO)<0) {
			this.leftOver = BigDecimal.ZERO;
			System.out.println("The charge amount was less than 0");
			return this.leftOver;
		} else {
			System.out.println("The discharge amount is " + difference + " and the resulting charge amount is " + this.leftOver.subtract(difference));
			this.leftOver=this.leftOver.subtract(difference);
			return this.leftOver;
		} 
	}
	
	public BigDecimal chargeBattery(BigDecimal difference) {
		if (this.leftOver.add(difference).compareTo(capacity)>0) {
			this.leftOver = capacity;
			System.out.println("The charge amount was greater than the capacity.");
			return this.leftOver;
		} else {
			System.out.println("The charge amount is " + difference + " and the resulting charge amount is " + this.leftOver.add(difference));
			this.leftOver = this.leftOver.add(difference);
			return this.leftOver;
		}
	}
}
