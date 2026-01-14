package chapter08;

public class Student extends People { 

	public int studentNo;
	
//	public Student() {
//	super();
//}
	
	public Student(String name, String ssn, int studentNo) {
		
		super(name, ssn); // People(String name, String ssn)
		this.studentNo = studentNo;
		
	}
	
	
}
