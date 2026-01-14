package chapter11;

class OutterRunnable {
	//클래스가 생성될 때 runner 객체도 같이 만들어짐. 상태(값)를 바꾸기 어렵다.
	// >> 고정된 실행 로직
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
			
		}
	};
}

public class AnonyMousInnerMain_06 {
	
	public static void main(String[] args) {
		OutterRunnable out = new OutterRunnable();
		out.runner.run();
		
	}
	
}
