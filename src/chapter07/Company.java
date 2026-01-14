package chapter07;

public class Company {

	private static Company instance = new Company(); //Singleton 패턴, 프로그램 전체에서 Company 객체를 하나만 쓰게 하기 위해. 어디서든 접근 가능
	
	public Company() {
		
	}
	
	public static Company getInstance() {
		
		// 예외처리 -> 생성됨 객체가 없으면 객체 생성
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}

}
