package chapter13;

public class GenericContainer<T> {

	private T[] items;
	private int count;

	public GenericContainer(int size) {
		items = (T[]) new Object[size];
		count = 0;
	}

	// 아이템을 추가하는 제네릭 메서드
	public void addItem(T item) {
		if (count < items.length) {
			items[count] = item;
			count++;
		} else {
			System.out.println("Container is full");
		}
	}
	
	public void printitems() {
		for(int i=0;i<count;i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println();
	}
	
	// E extends Number: 전제 타입 중 숫자 타입만 호환
	public <E extends Number> double sum(E[] numbers) {
		double total = 0;
		for (E number: numbers) {
			total += number.doubleValue(); // 언박싱
		}
		return total;
	}
}
