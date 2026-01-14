package chapter08;

public class C extends A_03{

	public C() {
		super(); // A클래스 생성자. 생략 가능
		this.field = "value";
		this.method();
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.method();
	}

}
