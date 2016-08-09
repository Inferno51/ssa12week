package com.people;

import java.util.ArrayList;

public class Building {
	
	public static void main (String[] args) {
		
		ArrayList<Person> ourBuilding = new ArrayList<>(3);
		
		Student studentA = new Student("Jon", 28, "male", 6.0f, "VU88728", true, true, true);
		Student studentB = new Student("Mary", 35, "female", 5.3f, "3875762", true, true, true);
		Janitor janitorA = new Janitor("Kavita", 30, "female", 5f, true, "Head Groundskeeper");
		
		ourBuilding.add(studentA);
		ourBuilding.add(studentB);
		ourBuilding.add(janitorA);
		
		for (int i = 0; i < ourBuilding.size(); i++) {
			System.out.println(ourBuilding.get(i).toString());
		}
	}
}
