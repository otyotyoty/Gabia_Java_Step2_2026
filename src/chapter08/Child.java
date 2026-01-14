package chapter08;

public class Child extends Parent {

	@Override
	public void method2() {
//		super.method2();
		System.out.println("Child-method2()"); //이래도 override
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
	
}
