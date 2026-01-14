package chapter14.treeset;

// record : 멤버변수 선언, 생성자 오버로딩, getter/setter 까지 이미 끝남
public record Employee(String name, int age) {

	@Override
	public String toString() {
		return name + ": " + age;
	}

}
