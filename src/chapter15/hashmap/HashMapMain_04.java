package chapter15.hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain_04 {

	public static void main(String[] args) {

		Hashtable<String, Integer> inventory = new Hashtable<>();

		inventory.put("apple", 50);
		inventory.put("banana", 30);
		inventory.put("grape", 20);
		inventory.put("Mango", 10);

		// HashMap 출력(순서 보장되지 않음)
		for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("\n재고를 확인할 상품명을 입력하세요: ");
		String product = scan.nextLine();

		if (inventory.containsKey(product)) {
			System.out.println(product + "의 재고는: " + inventory.get(product) + "개 입니다.");
		} else {
			System.out.println("해당 상품은 재고에 없습니다.");
		}

		// 상품 재고 업데이트
		System.out.println("\n재고를 업데이트할 상품명을 입력하세요: ");
		String updateProduct = scan.nextLine();

		if (inventory.containsKey(updateProduct)) {
			System.out.println("추가할 수량을 입력하세요: ");
			int addQuantity = scan.nextInt();
			inventory.put(updateProduct, inventory.get(updateProduct) + addQuantity);
			System.out.println(updateProduct + "의 재고는 현재 " + inventory.get(updateProduct) + "개 입니다.");
		} else {
			System.out.println("해당 상품은 재고에 없습니다.");
			System.out.println("수량을 입력하세요: ");
			int addNewQuantity = scan.nextInt();
			inventory.put(updateProduct, addNewQuantity);
		}

	}
}
