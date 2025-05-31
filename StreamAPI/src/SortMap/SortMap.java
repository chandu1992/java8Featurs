package SortMap;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 3);
		map.put("banana", 1);
		map.put("cherry", 2);

		// TreeMap sorts keys automatically
		Map<String, Integer> sortedByKey = new TreeMap<>(map);

		for (Map.Entry<String, Integer> entry : sortedByKey.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}


	}
}
