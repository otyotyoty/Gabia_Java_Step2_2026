package chapter18.stream;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationMain_03 {

	public static void main(String[] args) {

		// Stream.of(): 객체를 스트림으로 변환

		// File 객체들의 스트림 생성
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("Ex2"),
				new File("Ex2.bak"), new File("Test.java"));

		// 파일의 확장자를 추출 후 중복 제거하여 출력
		stream.map(File::getName) // 파일 이름만 추출. Stream<File> → Stream<String> 스트림 타입 변환
		.filter(f -> f.indexOf(".") > -1) // 이름에서 확장자가 있는 파일만 필터링
		.map(f -> f.substring(f.lastIndexOf(".") + 1)) // 확장자만 잘라내기. 결과: txt, txt, bak, java
		.distinct() // 중복 제거. 결과: txt, bak, java
		.forEach(System.out::println); // 출력
		
		System.out.println("---------------------------------------------------------------------");
		
		// Arrays.asList(): 배열을 스트림으로 변환
		List<String> list = Arrays.asList("Reflection", "Collection", "Stream", "Structure", "State", "Flow", "Sorting",
				"Mapping", "Reduction", "Stream");
		
		// 중간결과 저장
		Set<String> intermediaResults = new HashSet<>();
		
		List<String> result = list.stream()
		.filter(s->s.startsWith("S")) // S로 시작하는 문자열만 통과
		.map(String::toUpperCase) // 대문자로 변환
		.distinct() // 중복 제거
		.sorted() // 정렬
		.peek(s -> intermediaResults.add(s)) //중간 결과 훔쳐보기. peek 는 디버깅 용으로 데이터 저장용이 아니다.
		// 이렇게 외부 Set에 데이터 저장하면 부작용 발생할 수 있다. 병렬 스트림에서 버그 발생 가능
		.collect(Collectors.toList()); // 새로운 리스트로 수집
		
		System.out.println("resfult Result");	
		result.forEach((i) -> System.out.println(i + " "));
		
		
	}
}
