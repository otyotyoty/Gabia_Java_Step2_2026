package chapter08;

public class ChildMain_06 {

	public static void main(String[] args) {

		Child child = new Child();
		child.method1(); //부모꺼
		child.method2(); //자식꺼
		child.method3(); //자식꺼
		System.out.println();
		
		Parent parent1 = child; // Parent parent2 = new Child(); 랑 같음
		parent1.method1(); //부모꺼
		parent1.method2(); //자식꺼
		System.out.println();
		
		Parent parent2 = new Parent();
		parent2.method1(); //부모꺼
		parent2.method2(); //부모꺼
		
		
	}

}
