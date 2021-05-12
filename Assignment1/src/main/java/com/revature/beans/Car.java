package com.revature.beans;

public class Car {
	private String make;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public Car() {
		this.make = "Mazda";
	}
	public Car(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.make + " car goes vroom!";
	}
	
}
