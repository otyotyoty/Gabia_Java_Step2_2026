package chapter15.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator_02 {
	
	public static void main(String[] args) {
		TreeMap<Integer,Integer> scoreMap = new TreeMap<>(Comparator.reverseOrder());
		
		scoreMap.put(1003, 85);
		scoreMap.put(1001, 90);
		scoreMap.put(1002, 88);
	}

}
