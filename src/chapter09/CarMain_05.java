package chapter09;

public class CarMain_05 {
	public static void method(Car c) {
		c.run();
		}
	
	public static void main(String[] args) {
		System.out.println("[자율주행 자동차]");
		method(new AICar());
		System.out.println("[기본 자동차]");
		method(new ManualCar());
		
		System.out.println("[자율주행 자동차]");
		Car mycar = new AICar();
		mycar.run();
	}
}
