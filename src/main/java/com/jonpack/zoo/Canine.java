package com.jonpack.zoo;

public class Canine extends Animal{
	
	private int legs = 4;
	private int claws = 0;
	private boolean domestic = false;
	
	public Canine(String name, String color, String gender, int eyes, float height, int legs, int claws,
			boolean domestic) {
		super(name, color, gender, eyes, height);
		this.legs = legs;
		this.claws = claws;
		this.domestic = domestic;
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

	@Override
	public String toString() {
		String isDomesticated = null;
		
		if (domestic) {
			isDomesticated = "domesticated";
		} else {
			isDomesticated = "non-domesticated";
		}
		
		return "A canine named " + name + ". It had " + legs + " legs and " + claws + " claws. It is a " + isDomesticated + " canine. "
				+ "It was a " + color + ", " + gender + " canine with " + eyes + " eyes and it was " + height + " feet tall.";
	}
	
	
}
