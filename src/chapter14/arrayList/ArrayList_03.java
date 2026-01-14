package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("지건우");
		list.add("김태완");
		list.add("이연승");
		list.add("김자월");
		list.add("김청우");
		list.add("김민석");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String v = it.next();
			System.out.print(v + " ");
		}
		
	}

}
