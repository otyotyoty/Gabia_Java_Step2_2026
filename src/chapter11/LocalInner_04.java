package chapter11;

class Outter {
	
	int outNum = 100;
	static int sNum = 200;
	
	//class(X) 익명의 클래스
	Runnable getRunnable(int i) { // functional interface?
		
		//Runnable 안에서 정의하는 변수는 final 형태이고 재정의가 안된다.
		int num = 100; //final
		
		class MyRunnable implements Runnable {
			
			int localNum = 10; // 멤버변수

			@Override
			public void run() {
				
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("(외부)outNum = " + outNum);
				
				System.out.println("(외부 Metaspace)sNum = " + Outter.sNum);
			}
		}//MyRunnable
		
		return new MyRunnable();
		
	}// getRunnalbe
}


public class LocalInner_04 {
	
	public static void main(String[] args) {
		
		Outter out = new Outter();
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
