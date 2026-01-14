package chapter14.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain_01 {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("aaa");
		treeSet.add("bbb");
		treeSet.add("ccc");
		
		treeSet.add("aaa");

		System.out.println("HashSet: " + treeSet);
		
		if(treeSet.contains("bbb")) {
			System.out.println("bbb is in the treeSet");
		}
		
		treeSet.remove("ccc");
		System.out.println("HashSet: " + treeSet);
	}
}

