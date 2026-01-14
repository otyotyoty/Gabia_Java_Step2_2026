package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size: " + list.size());

		list.add(100);
		list.add(50);
		System.out.println("list.size: " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-------Iterator-------");
		Iterator<Integer> it = list.iterator(); //일반 데이터를 반복 구조로 형변환 -> hasNext() 사용
		
		while(it.hasNext()) {
			int v = it.next(); //언박싱
			System.out.println(v);
		}

	}

}
