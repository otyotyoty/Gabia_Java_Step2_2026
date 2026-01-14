package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MemberHashMap {
	
	private Map<Integer, String> hashMap;

	// 생성자(HashMap 참조 메모리 확보)
	
	public MemberHashMap() {
		this.hashMap = new HashMap<Integer, String>();
	}
	
	
	public void addMember(Member member) {
		if (hashMap.containsKey(member.memberId())) {
			System.out.println(member.memberId() + " : " + member.memberName() + "님은 중복된 멤버입니다.");
		} else {
			hashMap.put(member.memberId(), member.memberName());
			System.out.println(member.memberId() + " : " + member.memberName() + " 멤버를 추가했습니다.");
		}
		
	}
	
//	public void removeMember(int memberId) {
//		
//		if (hashMap.containsKey(memberId)) {
//			System.out.println(memberId + " : " + hashMap.get(memberId) + " 멤버를 삭제했습니다.");
//			hashMap.remove(memberId);
//		} else {
//			System.out.println(memberId + " 아이디의 멤버는 존재하지 않습니다.");
//		}
//	}
	
	public boolean removeMember(int memberId) {
		
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			String member = hashMap.get(key);
			System.out.println(member);
		}
	}	
//		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue()); 
//		}
//	}
// 이게 더 가독성 좋고 kay, value 한번에 접근
}
