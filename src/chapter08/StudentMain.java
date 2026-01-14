package chapter08;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student("홍길동", "010-1234-5678", 1000);
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);

	}

}
