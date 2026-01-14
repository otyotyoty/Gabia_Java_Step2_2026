package chapter12.hashcode;

public class KeyMain {

	public static void main(String[] args) {
		
		Key hashKey1 = new Key(1);
		Key hashKey2 = new Key(1);
		Key hashKey3 = new Key("김자바");
		Key hashKey4 = new Key("김자바");
		
		// 물리적 주소
		System.out.println(hashKey1);
		System.out.println(hashKey2);
		System.out.println(hashKey3);
		System.out.println(hashKey4);
		
		if(hashKey1.equals(hashKey2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if(hashKey3.equals(hashKey4)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
