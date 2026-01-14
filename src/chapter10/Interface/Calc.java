package chapter10.Interface;

public interface Calc {
	
	public static final double PI = 3.14;
	int ERROR = -9999999;
	
	// 추상 메서드
	int add(int num1, int num2);
	
	int subtract(int num1, int num2);
	
	int times(int num1, int num2);
	
	int divide(int num1, int num2);
	
	//일반 메서드 사용 불가능
//	public void display() {	}
	
	// 자바 8부터 제공 -> 기본 수행문을 구현할 때 사용(재정의 가능)
	default void description() {
		myMethod();
		System.out.println("정수 계산기");
	}
	// 자바 8부터 제공
	static int total(int[] arr) {
		int total = 0;
		
		for(int i:arr) {
			total += i;
		}
		myStaticMethod();
		return total;
	}
	//자바 9부터 제공 -> private 메서드는 현재의 클래스에서만 사용가능
	private void myMethod() {
		System.out.println("private 메서드");
	}
	// 정적 메서드 -> 객체 생성과 상관없이 클래스 명으로 사용 가능
	private static void myStaticMethod() {
		System.out.println("private static 메서드");
	}

}
