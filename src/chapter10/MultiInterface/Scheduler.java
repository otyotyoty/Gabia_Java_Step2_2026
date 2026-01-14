package chapter10.MultiInterface;

public interface Scheduler {
	
	// 다음 고객의 콜 가져오기
	void getNextCall();
	
	// 상담원에게 콜 전달
	void sendCallToAgent();
}
