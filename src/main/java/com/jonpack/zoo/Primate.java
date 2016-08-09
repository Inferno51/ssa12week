package com.jonpack.zoo;

public class Primate extends Animal{
	
	private int arms = 2;
	private int legs = 2;
	private boolean tail = false;
	private String diet = "omnivore";
	
	public Primate(String name, String color, String gender, int eyes, float height, int arms, int legs, boolean tail,
			String diet) {
		super(name, color, gender, eyes, height);
		this.arms = arms;
		this.legs = legs;
		this.tail = tail;
		this.diet = diet;
	}

	public int getArms() {
		return arms;
	}

	public void setArms(int arms) {
		this.arms = arms;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public boolean isTail() {
		return tail;
	}

	public void setTail(boolean tail) {
		this.tail = tail;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	@Override
	public String toString() {
		String hasTail = null;
		
		if (tail) {
			hasTail = "tail";
		} else {
			hasTail = "no tail";
		}
		
		return "A primate named " + name + ". It had " + legs + " legs and " + arms + " arms. It had " + hasTail 
				+ ", and it was an " +  diet + ". It was a "	+ color + ", " + gender 
				+ " primate with " + eyes + " eyes and it was " + height + " feet tall.";
	}
	
	
}
