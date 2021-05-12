package com.revature.main;
import com.revature.beans.Car;
import com.revature.beans.Plane;
public class Driver {
	public static void main(String[] args) {
		Car mazda = new Car();
		Car ferrari = new Car("Ferrari");
		Plane boeing = new Plane();
		Plane concord = new Plane(1000, "Concord");
		
		System.out.println("Matt's " + mazda + " And his " + boeing + " Even more that that... His " + ferrari + " And his " + concord);
	}
}
