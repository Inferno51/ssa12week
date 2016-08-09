package com.tiy.ssa.weektwo.day1.prework;

// import java.util.ArrayList;

public class BaseballPlayer {
	
	private String batterName;
	private int atBats;
	private int homeRuns;
	private int triples;
	private int doubles; 
	private int singles;
	private int outs;
	private float battingAverage;
	private float sluggingAverage;
	private int onBase; 
	private int hitsAvg; 
	// Constructor for the Baseball Player object.
	public BaseballPlayer() {
		
		this.batterName = batterName;
		this.atBats = atBats;
		this.homeRuns = homeRuns;
		this.triples = triples;
		this.doubles = doubles;
		this.singles = singles;
	}

	public String getBatterName() {
		return batterName;
	}

	public void setBatterName(String batterName) {
		this.batterName = batterName;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns += homeRuns;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples += triples;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles += doubles; 
	}

	public int getSingles() {
		return singles;
	}

	public void setSingles(int singles) {
		this.singles += singles;
	}
	
	public int getOuts() {
		return outs;
	}
	
	public void setOuts(int outs) {
		this.outs += outs;
	}
	
	public float setBattingAverage() {
		hitsAvg = this.homeRuns + this.triples + this.doubles + this.singles;
		battingAverage = (float) hitsAvg / (float) atBats;
		return battingAverage; 
	}
	
	public float setSluggingAverage() {
		onBase = (homeRuns* 4) + (triples * 3) + (doubles * 2) + (singles);
		sluggingAverage = (float) onBase / (float) atBats;
		return sluggingAverage; 
	}
}
