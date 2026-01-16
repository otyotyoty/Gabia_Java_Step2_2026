package chapter18.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain_01 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("je", "emily", "kevin", "brian", "e");
		
		//길이가 3 이상인 이름을 대문자로 바꾸고 정렬하여 출력
		names.stream() // 리스트를 스트림(흐름) 으로 바꾼다
	     .filter(name -> name.length() >= 3) // 조건 검사. 입력: String name 출력: boolean
	     .map(String::toUpperCase) // 변환. 소문자 → 대문자
	     .sorted() // 정렬. String → 사전순 정렬
	     .forEach(System.out::println); // 하나씩 소비. 출력하고 끝
		
//		names.stream().filter(name -> name.length() >= 3).map(String::toUpperCase).sorted().forEach(System.out::println);
		
	}

}
