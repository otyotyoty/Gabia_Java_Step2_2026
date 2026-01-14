package chapter15.hashmap;

public record Member(int memberId, String memberName) {

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";

	}
	
}
