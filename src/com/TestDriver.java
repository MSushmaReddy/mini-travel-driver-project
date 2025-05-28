package com;

import java.util.Arrays;

public class TestDriver {
	public static void main(String[] args) {
		Driver firstDriver = new Driver("Car", 123, "Sushma", 2000);
		Driver secondDriver = new Driver("Lorry", 345, "Nithish", 890);
		Driver thirdDriver = new Driver("Lorry", 124, "laxmi", 1990);
		Driver[] allDrivers = { firstDriver, secondDriver, thirdDriver };

		Travel t = new Travel();
		System.out.println("Is secondDriver a car driver? " + t.isCarDriver(secondDriver));
		System.out.println("Retrieve by Driver ID (123): " + t.retrivebyDriverId(allDrivers, 123));
		System.out.println("Count of 'Lorry' drivers: " + t.retriveCountOfDriver(allDrivers, "Lorry"));
		System.out
				.println("Drivers with vehicle type 'Lorry': " + Arrays.toString(t.retriveDriver(allDrivers, "Lorry")));
		System.out.println("Driver with max distance: " + t.retriveMaximumDistanceTravelledDriver(allDrivers));
	}
}
