package SortMap;

import java.util.*;

public class SortMap2 {

	public static void main(String[] args) {
		
		
		        Map<String, Integer> map = new HashMap<>();
		        map.put("apple", 3);
		        map.put("banana", 1);
		        map.put("cherry", 2);

		        // Convert entries to list
		        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		        
		        System.out.println(list);

		        // Sort list by value
		        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
		            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
		                return b.getValue() - a.getValue(); // ascending
		            }
		        });
		        
		      

		        // Put sorted entries into LinkedHashMap to preserve order
		        Map<String, Integer> sortedMap = new LinkedHashMap<>();
		        for (Map.Entry<String, Integer> entry : list) {
		            sortedMap.put(entry.getKey(), entry.getValue());
		        }

		        // Print sorted map
		        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
		            System.out.println(entry.getKey() + " = " + entry.getValue());
		        }
		    }
		


	
}
