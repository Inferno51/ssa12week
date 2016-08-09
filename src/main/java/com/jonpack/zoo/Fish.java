package com.jonpack.zoo;

public class Fish extends Animal{
	
	private int fins = 0;
	private boolean hasScales = true;
	
	
	public Fish(String name, String color, String gender, int eyes, float height, int fins, boolean hasScales) {
		super(name, color, gender, eyes, height);
		this.fins = fins;
		this.hasScales = hasScales;
	}


	public int getFins() {
		return fins;
	}


	public void setFins(int fins) {
		this.fins = fins;
	}


	public boolean isHasScales() {
		return hasScales;
	}


	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}


	@Override
	public String toString() {
		String scales = null;
		
		if (hasScales) {
			scales = "had scales";
		} else {
			scales = "didn't have scales";
		}
		
		return "A fish named " + name + ". It had " + fins + " fins. It " + scales 
				+ ", and it was " + color + ", " + gender + " fish with " 
				+ eyes + " eyes and it was " + height + " feet tall.";
	}
	
	
}
