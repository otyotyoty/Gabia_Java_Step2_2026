package chapter08;

public class CompanyMain_09 {

	public static void main(String[] args) {
		
		Employee employee = new Employee("홍길동", 10);
		employee.getInfo();
		employee.work();
		System.out.println();

		Manager manager = new Manager("김길동", 20, "회계");
		manager.getInfo();
		manager.work();
		manager.approveLeave("홍길동");
		System.out.println();
		
		Employee employee2 = new Manager("박길동", 30, "홍보");
		employee2.getInfo();
		employee2.work();
// 		employee2.approveLeave
		

	}

}
