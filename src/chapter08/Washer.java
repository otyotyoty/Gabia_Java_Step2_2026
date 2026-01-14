package chapter08;

public class Washer extends Appliance {

	public Washer(String brand) {
		super(brand);
	}

	@Override
	void turnOn() {
		super.turnOn();
		System.out.println("세탁기를 작동시킵니다.");
	}
	
}
