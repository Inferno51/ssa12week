package com.jonpack.zoo;

public class Animal {
	
	protected String name = null;
	protected String color = null;
	protected String gender = null;
	protected int eyes = 2;
	protected float height = 0.0f;
	
	public Animal(String name, String color, String gender, int eyes, float height) {
		this.name = name;
		this.color = color;
		this.gender = gender;
		this.eyes = eyes;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
}
