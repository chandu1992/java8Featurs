package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("kivi");
		
		List<String> sortFruit2 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortFruit2);
		
//		Ascending order
		
		List<String> sortList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortList);
		
//		Descending order
		List<String> sortRevList = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortRevList);
		
		List<String> sortFruit1 = sortList.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(sortFruit1);
		
		List<String> sortRevFruit1 = sortList.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println(sortRevFruit1);
		
	}
}
