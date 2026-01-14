package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInfoMain_05 {

	public static void main(String[] args) {
		// UserInfo타입의 ArrayList -> arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		Scanner scan = new Scanner(System.in);
		UserInfo ui;
		
		outer: while(true) {
			System.out.print("아이디 생성(exit입력시 종료): ");
			String id = scan.nextLine();
			
			if(id.equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				return;
			}
			
			ui = new UserInfo();
			ui.setId(id);
			
			for (int i=0; i<arr.size(); i++) {
				if (ui.getId().equals(arr.get(i).getId())) {
					System.out.println("아이디가 중복되었습니다. 다른 아이디를 입력하세요");
					continue outer;
				}
			}
			
			System.out.print("패스워드 입력: ");
			ui.setPwd(Integer.parseInt(scan.nextLine()));
			
			arr.add(ui);
			
			System.out.println(ui.getId());
			System.out.println(ui.getPwd());
			System.out.println("----------------------");
			
		}
		
	}
	
}
