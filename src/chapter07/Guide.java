package chapter07;

import java.util.Scanner;

public class Guide {
	
	// 멤버변수
	static String point;
	Guest[] guest; // String[] str = new String[5];
	Scanner scan;
	
	// 생성자
	public Guide(int n) {
		// 목적지
		point = "발리";
		// 관광객 수 만큼 참조공간 확보;
		guest = new Guest[n]; // null
		// null 대신 객체 선언
		for(int i=0;i<n;i++) {
			guest[i] = new Guest();
		}
	}
	
	
	//getter
	public static String getPoint() {
		return point;
	}
	

}
