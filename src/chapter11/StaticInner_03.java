package chapter11;

public class StaticInner_03 {
	
	int a = 10; // stack 영역
	private int b = 100; // class 내부에서만 사용가능
	static int c = 200; // Metaspace
	
	// 내부 클래스 Metaspace
	static class Inner {
		
		static int d = 1000;
		
		public void printData() {
//			System.out.println(a); // Metaspace 영역이 아니므로 사용 불가능"
//			System.out.println(b); // Metaspace 영역이 아니므로 사용 불가능"
			System.out.println("Metaspace 영역이므로 사용 가능: " + c);
			System.out.println("Metaspace 영역이므로 사용 가능: " + d);
			
		}
	}
	
	public static void main(String[] args) {
		
//		이렇게 할 필요 없음
//		StaticInner_03.Inner obj = new StaticInner_03.Inner();
//		obj.printData();
		
		Inner inner = new Inner();
		inner.printData();

	}

}
