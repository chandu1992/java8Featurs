package Collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodsOfCollector {
	
	public static void main(String[] args) {
		
		List<String> listconv = Stream.of("Apple","Banana","Mango").collect(Collectors.toList());
		System.out.println(listconv);
		
		Set<String> set = Stream.of("Apple","Apple","Mango").collect(Collectors.toSet());
		System.out.println(set);
		
		String s = Stream.of("A","B","C").collect(Collectors.joining());
		System.out.println(s);
		
		String s1 = Stream.of("A","B","C").collect(Collectors.joining(",","[","]"));
		System.out.println(s1);
	}

}
