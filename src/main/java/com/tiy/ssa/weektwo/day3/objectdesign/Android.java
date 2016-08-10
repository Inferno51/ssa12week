package com.tiy.ssa.weektwo.day3.objectdesign;

public class Android extends Robot{
	
	//Variable declaration.
	public int numHeads = 0;
	public int numArms = 0;
	public int numLegs = 0;
	public boolean infraredScanner = false;
	public boolean geigerCounter = false; 
	public boolean weapons = false; 
	public float height = 0.00f;
	public float width = 0.00f;
	public float depth = 0.00f;
	public String behavior = null;
	public String name = null; 
	
	//Constructor for the Android class.
	public Android(int numHeads, int numArms, int numLegs, boolean infraredScanner,
			boolean geigerCounter, boolean weapons, float height, float width, float depth, String behavior,
			String name) {
		this.numHeads = numHeads;
		this.numArms = numArms;
		this.numLegs = numLegs;
		this.infraredScanner = infraredScanner;
		this.geigerCounter = geigerCounter;
		this.weapons = weapons;
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.behavior = behavior;
		this.name = name;
	}


	//Blank constructor for Android class.
	public Android() {
		super();
	}

	

	//Include abstract methods from Robot.java
	@Override
	public void functions() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void powersOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void combat() {
		// TODO Auto-generated method stub
		
	}
	
	
	//Getters and setters for Android.
	public int getNumHeads() {
		return numHeads;
	}

	public void setNumHeads(int numHeads) {
		this.numHeads = numHeads;
	}

	public int getNumArms() {
		return numArms;
	}

	public void setNumArms(int numArms) {
		this.numArms = numArms;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	public boolean isInfraredScanner() {
		return infraredScanner;
	}

	public void setInfraredScanner(boolean infraredScanner) {
		this.infraredScanner = infraredScanner;
	}

	public boolean isGeigerCounter() {
		return geigerCounter;
	}

	public void setGeigerCounter(boolean geigerCounter) {
		this.geigerCounter = geigerCounter;
	}

	public boolean isWeapons() {
		return weapons;
	}

	public void setWeapons(boolean weapons) {
		this.weapons = weapons;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) {
		this.depth = depth;
	}

	public String getBehavior() {
		return behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	//String output. 
	@Override
	public String toString() {
		String infraredYN = null;
		String geigerYN = null; 
		String weaponYN = null;
		
		if (infraredScanner == true) {
			infraredYN = "should";
		} else {
			infraredYN = "should not";
		}
		
		if (geigerCounter == true) {
			geigerYN = "should";
		} else {
			geigerYN = "should not";
		}
		
		if (weapons == true) {
			weaponYN = "should";
		} else {
			weaponYN = "should not";
		}
		
		return "The Android you have chosen to build is called " + name + ". It will have " 
				+ numHeads + " head(s) and " + numArms + " arms and "+ numLegs + " legs. You stated that the robot " + infraredYN 
				+ " have an infrared scanner. You also stated that it " + geigerYN + " have a geiger counter and it " 
				+ weaponYN + " have a laser cannon. The robot should be " + height + " feet tall, " + width
				+ " feet wide, and " + depth + " feet deep. Finally, the robot should be " + behavior + " in nature. Thank you for choosing RobCo!";
	}
}
