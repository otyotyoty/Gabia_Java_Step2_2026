package chapter14.hashset;

public class SolDeskMember {
	
	private int memberId;
	private String memberName;
	
	public SolDeskMember() {
	}

	public SolDeskMember(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	

	@Override
	public int hashCode() {
		return memberId;
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		if(obj instanceof SolDeskMember) {
//			SolDeskMember member = (SolDeskMember)obj;
//			return (this.memberId == member.memberId || this.memberName.equals(member.memberName));
//		}
//		
//		return super.equals(obj);
//	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // 두 참조가 완전히 같은 객체이면 true
	    if (!(obj instanceof SolDeskMember)) return false; // 비교 대상이 같은 타입이 아니면 false. Object에 다른 타입이 들어올 수 있어 바로 캐스팅하면 위험하다.

	    SolDeskMember m = (SolDeskMember) obj; // Object → SolDeskMember로 다운캐스팅
	    return this.memberId == m.memberId; // id가 같으면 같은 회원
	    // memberName 이름은 중복이 가능해 식별자로 부적합
	}

	@Override
	public String toString() {
//		return "SolDeskMember [memberId=" + memberId + ", memberName=" + memberName + "]";
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	
	
	

}
