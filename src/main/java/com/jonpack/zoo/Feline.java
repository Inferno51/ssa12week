package com.jonpack.zoo;

public class Feline extends Animal{
	
	private int legs = 4;
	private int claws = 0;
	private boolean domestic = false;
	private boolean hairless = false;
	
	public Feline(String name, String color, String gender, int eyes, float height, int legs, int claws,
			boolean domestic, boolean hairless) {
		super(name, color, gender, eyes, height);
		this.legs = legs;
		this.claws = claws;
		this.domestic = domestic;
		this.hairless = hairless;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getClaws() {
		return claws;
	}

	public void setClaws(int claws) {
		this.claws = claws;
	}

	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}

	public boolean isHairless() {
		return hairless;
	}

	public void setHairless(boolean hairless) {
		this.hairless = hairless;
	}

	@Override
	public String toString() {
		String isDomesticated = null;
		String isHairless = null;
		
		if (domestic) {
			isDomesticated = "domesticated";
		} else {
			isDomesticated = "non-domesticated";
		}
		
		if (hairless) {
			isHairless = "hairless";
		} else {
			isHairless = "fuzzy";
		}
		
		return "A feline named " + name + ". It had " + legs + " legs and " + claws + " claws. It is a " + isDomesticated 
				+ " feline, and it was " + isHairless + ". It was a " + color + ", " + gender + " cat with " 
				+ eyes + " eyes and it was " + height + " feet tall.";
	}
	
	
}
