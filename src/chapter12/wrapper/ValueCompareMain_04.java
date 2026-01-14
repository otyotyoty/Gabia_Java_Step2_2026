package chapter12.wrapper;

public class ValueCompareMain_04 {

	public static void main(String[] args) {
		// ✔ -128 ~ 127 범위 안에서 JVM이 Integer Cache 사용
		// ✔ 같은 객체 재사용해서 주소가 같음
		// [결론 : Wrapper 클래스에서 == 말고 equals() 써라]
		
		
		// 오토박싱의 범위
		System.out.println("[-128 ~ 128초과할 경우]");
		Integer obj1 = 300; //4byte = 32bit
		Integer obj2 = 300;
		
		// 주소 비교
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("==언박싱한 후 결과: " + (obj1.intValue() == obj2.intValue()));
		
		System.out.println("[-128 ~ 128범위 내인 경우]");
		Integer obj3 = 100; //4byte = 32bit
		Integer obj4 = 100;
		
		// 주소 비교(1byte 내에서는 캐싱(cache)되어 같은 객체를 사용
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("==언박싱한 후 결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("==equals: " + (obj3.equals(obj4)));
		
	}

}
