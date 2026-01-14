package chapter14.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain_02 {
	
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("aaa");
		hashSet.add("bbb");
		hashSet.add("ccc");
		
		hashSet.add("aaa");

		System.out.println("HashSet: " + hashSet);
		
		if(hashSet.contains("bbb")) {
			System.out.println("bbb is in the HashSet");
		}
		
		hashSet.remove("ccc");
		System.out.println("HashSet: " + hashSet);
		
		
	}

}
