package chapter14.vector;

import java.util.Vector;

public class VectorCapacity {

	public static void main(String[] args) {

		// Vector 방식: 동기화 즉 멀티스레드에서 사용
		// 최근에는 ArrayList를 기본으로 사용하고 synchronizedList를 추가하여 사용
//		List<String> sysList = Collections.synchronizedList(new ArrayList<>());		

		// 구버전(기본용량 10)
		Vector<String> vector = new Vector<String>();

		System.out.println("------------기본크기-------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");

		System.out.println("------------데이터 3개 증가 후 크기-------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

		for (int i = 0; i < 8; i++) {
			vector.add("Fruit" + (i + 1));
		}

		System.out.println("------------데이터 11개 증가 후 크기-------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

	}

}
