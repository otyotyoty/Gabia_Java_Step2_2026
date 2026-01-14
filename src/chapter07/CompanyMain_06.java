package chapter07;

public class CompanyMain_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company company1 = new Company();
		Company company2 = new Company();
		
		System.out.println(company1);
		System.out.println(company2);
		
		System.out.println("--------------singleton--------------");
		// MetaSpace 영역에서 객체 생성
		Company mycompany1 = Company.getInstance();
		Company mycompany2 = Company.getInstance();
		
		System.out.println(mycompany1);
		System.out.println(mycompany2);
		System.out.println(mycompany1==mycompany2);
		
	}

}
