package chapter09;

public abstract class Computer {

	// 추상 메서드 -> Body가 없다
	public abstract void display(); // 하위 클래스 구현부에서 구현해서 사용
	
	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
