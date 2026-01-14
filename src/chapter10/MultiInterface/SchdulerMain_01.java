package chapter10.MultiInterface;

import java.util.Scanner;

public class SchdulerMain_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			char input = scan.next().toUpperCase().charAt(0);
			int ch = (int) input;
			if (ch == 'R') {
				allocate(new RoundRobin());
			} else if (ch == 'L') {
				allocate(new LeastJob());
			} else if (ch == 'P') {
				allocate(new PriorityAllocation());
			} else if (ch == 'S') {
				break;
			} else {
				System.out.println("지원하지 않는 서비스 입니다.");
			}
			
		}

	}
	
	public static void allocate(Scheduler s) {
		s.getNextCall();
		s.sendCallToAgent();
	}

}
