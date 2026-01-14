package chapter07;

import java.util.Scanner;

public class Tour_04 {

	public static void main(String[] args) {


	
		Scanner scan = new Scanner(System.in);
		System.out.print("관광객 수: ");
		int n = Integer.parseInt(scan.nextLine());

		// 초기화를 통해서 참조 메모리 확보(Guide의 객체 개수)
		Guide guide = new Guide(n); // guide.guest[0]~guide.guest[4]

		System.out.println();
		System.out.println("관광객 등록");
		// 이름 성별
		for (int i=0; i<n; i++) {
			System.out.print((i + 1) + ".이름: ");
			String name = scan.nextLine();
			guide.guest[i].setName(name);
			System.out.print((i + 1) + ".성별: ");
			String gender = scan.nextLine();
			guide.guest[i].setGender(gender);
			
		}
		
		System.out.println();
		outer: while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			
			int select = Integer.parseInt(scan.nextLine());
			switch(select) {
				case 1:
					for (int i = 0; i < n; i++) {
						System.out.println((i + 1) + ".이름: " + guide.guest[i].getName());
						System.out.println((i + 1) + ".성별: " + guide.guest[i].getGender());
						System.out.println((i + 1) + ".목적지: " + Guide.getPoint());
					}
					break;
				case 2:
					System.out.print("어디로 변경하시겠습니까?: ");
					Guide.point = scan.nextLine();
					System.out.println(Guide.point + "로 변경 완료");
					System.out.println();
					break;
				case 3:
					System.out.println("종료");
					break outer;
					
			}
		
		}
//		String p = Guide.getPoint(); point는 모든 Guide가 공유하는 값. 객체 없이도 접근 가능해야 하므로 getPoint()에도 static이 존재

	}

}
