package chapter11;

class OutterRun {
	
	//getRunnable()이 호출될 때마다 새 Runnable 생성. 호출될 때마다 다른 Runnable 가능
	// >> 유연한 실행 로직 생성기
	Runnable getRunnable(int i) { 
		int num = 100;
		
		return new Runnable() { // 
			
			@Override
			public void run() {
				// num=200;
				// i=10;
				System.out.println(i);
				System.out.println(num);
				
			}//run
		};
	}//Runnable
}


public class AnonyMousInnerMain_05 {
	
	public static void main(String[] args) {
		
		OutterRun out = new OutterRun();
		Runnable runnable =  out.getRunnable(10); //Runnable 하나가 자기만의 데이터를 가짐
		runnable.run();
	}
}
