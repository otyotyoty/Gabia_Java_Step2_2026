package chapter08;

public class SportCarMain_08 extends Car {

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}

	public static void main(String[] args) {
		
		SportCarMain_08 ac = new SportCarMain_08();
		ac.speedUp();
		ac.stop();
	}
	
	
	
}
