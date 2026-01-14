package chapter08;

public class DriverMain_10 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();

//		Vehicle vehicle = new Bus();
//		driver.drive(vehicle);
		
		driver.drive(new Bus()); // 이것도 가능
		driver.drive(new Taxi());
		
		
		
	}

}
