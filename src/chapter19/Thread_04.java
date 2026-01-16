package chapter19;

class Counter {

	private int count = 0;

	// synchronized : 공유 자원에 대해 한 번에 하나의 스레드만 접근하게 함
	// thread1이 increment() 실행 중이면 thread2는 대기
	// 동기화 없으면 두 스레드가 동시에 읽고 같은 값으로 덮어씀. 값 손실 발생
	synchronized void increment() {
		count++;
	}

	public int getCount() {
		return count;
	}
}

public class Thread_04 {

	public static void main(String[] args) {

		Counter counter = new Counter();

		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		}; // Runnable

		Thread thread1 = new Thread(task); // Runnable → Thread로 감싸기 -> 일반 객체를 스레드로 실행 가능하게 변환
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); // thread1 끝날 때까지 대기
			thread2.join(); // thread2 끝날 때까지 대기
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(counter.getCount());
		
		

	}
}
