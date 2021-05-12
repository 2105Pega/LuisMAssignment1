package com.revature.beans;

public class Plane {
	private int maxSpeed;
	private String make;
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public Plane() {
		this.maxSpeed = 700;
		this.make = "Boeing";
	}
	public Plane(int maxSpeed, String make) {
		this.maxSpeed = maxSpeed;
		this.make = make;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.make + " plane goes woosh at over " + this.maxSpeed+ " miles per hours!";
	}
	
}
