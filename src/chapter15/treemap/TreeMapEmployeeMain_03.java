package chapter15.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_03 {
	
	public static void main(String[] args) {
		
		// TreeMap 객체(employeeMap) 사원번호를 입력하면 사원의 이름과 나이가 출력
		
		TreeMap <Integer, Employee> employeeMap = new TreeMap<>();
		
		employeeMap.put(100, new Employee("David", 95));
		employeeMap.put(101, new Employee("Bob", 92));
		employeeMap.put(102, new Employee("Alice", 85));
		employeeMap.put(103, new Employee("Charlie", 78));
		
		System.out.println("===");
		for(Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
		int employeeId = 101;
		System.out.println("\n" + employeeId + "사원의 정보 - " + employeeMap.get(employeeId));
		
	}

}
