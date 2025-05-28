package com;

public class Travel {
	public boolean isCarDriver(Driver d) {
		return d.getCategory().equalsIgnoreCase("Car");
	}

	public String retrivebyDriverId(Driver[] driverDetails, int driverId) {
		for (Driver driver : driverDetails) {
			if ((driver.getDriverId()) == (driverId)) {
				return "Driver name is " + driver.getDriverName() + " belonging to the category " + driver.getCategory()
						+ " traveled " + driver.getTotalDistance() + " KM so far";
			}
		}
		return "Driver ID not found";
	}

	public int retriveCountOfDriver(Driver[] driverDetails, String category) {
		int count = 0;
		for (Driver driver : driverDetails) {
			if ((driver.getCategory()).equalsIgnoreCase(category)) {
				count++;
			}
		}
		return count;

	}

	public Driver[] retriveDriver(Driver[] driverDetails, String category) {
		int count = retriveCountOfDriver(driverDetails, category);
		Driver[] noOfDrivers = new Driver[count];
		int index = 0;
		for (Driver driver : driverDetails) {
			if (driver.getCategory().equals(category)) {
				noOfDrivers[index] = driver;
				index++;
			}
		}
		return noOfDrivers;

	}

	public Driver retriveMaximumDistanceTravelledDriver(Driver[] driverDetails) {
		double maxDistance = 0;
		Driver maxDriver = null;
		for (Driver driver : driverDetails) {
			if (driver.getTotalDistance() > maxDistance) {
				maxDistance = driver.getTotalDistance();
				maxDriver = driver;
			}

		}
		return maxDriver;
	}
}
