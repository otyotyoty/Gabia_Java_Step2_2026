package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		
		int select;
		Person p;
		Scanner scan = new Scanner(System.in);
		
		//Person 객체들만 저장할 ArrayList 생성(personarr)
		ArrayList<Person> personarr = new ArrayList<Person>();
			
		while(true) {
			System.out.print("(1)회원가입, (2)정보삭제, (3)정보검색, (4)종료:");
			
			select = Integer.parseInt(scan.nextLine());
			
			switch (select) {
			case 1: {
				p = new Person();
				System.out.println("---정보를 추가합니다---");
				
				System.out.print("이름: ");
				p.setName(scan.nextLine());
				System.out.print("나이: ");
				p.setAge(Integer.parseInt(scan.nextLine()));
				System.out.print("전화번호: ");
				p.setTel(scan.nextLine());
				
				personarr.add(p);
				System.out.println("회원가입 완료");
				break;
			}
				
			case 2: {
				System.out.println("---정보를 삭제합니다---");
				System.out.print("탈퇴회원 이름: ");
				String search = scan.nextLine();
				
				boolean removed = false;
				Iterator<Person> it = personarr.iterator();
				
				while(it.hasNext()) {
					p = it.next();
					if (search.equals(p.getName())) {
						System.out.println(search + "님의 정보가 삭제되었습니다.");
						it.remove(); // personarr.remove(p);
						removed = true;
						break;
					}
				}
				if(!removed) {
					System.out.println("삭제할 회원이 없습니다.");
				}
				break;
				
//				for(int i=0;i<personarr.size();i++) {
//					if(personarr.get(i).getName().equals(search)) {
//						personarr.remove(i);
//						System.out.println(search + "님의 정보가 삭제되었습니다.");
//						break;
//					} else {
//						if(i+1 == personarr.size()) {
//							System.out.println(search + "님의 정보가 없습니다.");
//						}
//					}
//				}//for
//				break;


				// for 방식은 삭제 후 인덱스가 밀리고 로직이 바뀌면 버그 생길 수 있다.
				// Iterator는 Iterator가 내부 상태 관리해서 구조 변경 예외가 없다.
				// 또한 모든 collection에서 사용 가능하다.

			}
				
			case 3: {
				System.out.println("---정보를 출력합니다--");
				System.out.println("등록인원은 " + personarr.size() + "명");
				
				Iterator<Person> it = personarr.iterator();
				
				while(it.hasNext()) {
					p = it.next();
					System.out.println("이름: "+ p.getName());
					System.out.println("나이: "+ p.getAge());
					System.out.println("전화번호: " + p.getTel());
					System.out.println("---------------------");
				}
				break;
			}
			
			default:
				System.out.println("프로그램 종료");
				return;

			}
		}
	}
}
