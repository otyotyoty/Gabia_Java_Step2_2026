package chapter08;

public class A_03 {
	//protected; 같은 패키지에서는 public 과 같음
	//다른 패키지에서는 privaite처럼 제한이 있음(상속 받으면 다른 패키지에서 사용 가능)
	protected String field;
	
	protected void method() {
		System.out.println("A Class");
		System.out.println(field);
	}
}
