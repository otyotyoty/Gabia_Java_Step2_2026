package chapter19;

public class DaemonThread_09 implements Runnable {

	static boolean autoSave = false; // main 스레드와 데몬 스레드가 공유, static → 하나의 값만 존재
	
	public static void main(String[] args) {
		
		DaemonThread_09 dm = new DaemonThread_09();
		Thread t = new Thread(dm); // Runnable → Thread로 감싸기 -> 일반 객체(dm)를 스레드로 실행 가능하게 변환
		t.setDaemon(true); // 데몬 스레드로 변환(메인이 종료되면 자동 종료)
		t.start();
		
		for(int i=0;i<15;i++) {
			//메인 스레드
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==3) {
				autoSave = true;
			}
		}
	}
	// 데몬 스레드(run 메서드)
	
	@Override
	public void run() {
		while (true) { // 메인 스레드가 살아 있는 동안만
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(autoSave) {
				System.out.println("자동 저장됩니다.");
			}
		}
	}//run
}
