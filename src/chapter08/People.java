package chapter08;

public class People {
	
	public String name;
	public String ssn;
	
//	public People() { // 상속하는 경우 오버로딩되면 기본 생성자도 꺼내놓아야함
//		
//	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		
	}
}
