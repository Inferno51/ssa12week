package com.people;

public class Janitor extends Person{
	
	private boolean isWorking = false;
	private String title = null;
	
	public Janitor(String name, int age, String gender, float height, boolean isWorking, String title) {
		super(name, age, gender, height);
		this.isWorking = isWorking;
		this.title = title;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
