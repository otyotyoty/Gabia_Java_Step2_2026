package chapter14.arrayList;

import java.util.ArrayList;
import java.util.List;

public class List_01 {
	
	public static void main(String[] args) {
		
//		ArrayList<String> student = new ArrayList<String>();
		List<String> students = new ArrayList<String>();
		
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Diana");
		
		//학생 출력
		System.out.println("--------Student List--------");
		for(String s:students) {
			System.out.println(s);
		}
		
		//특정 학생 제거
		students.remove("Bob");
		
		System.out.println("--------Student List--------");
		for(String s:students) {
			System.out.println(s);
		}
		
	}

}
