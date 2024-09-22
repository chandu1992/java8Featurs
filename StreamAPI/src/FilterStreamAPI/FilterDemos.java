package FilterStreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemos {

	public static void main(String[] args) {
		
		List<Integer> data = Arrays.asList(10,20,22,23,33,44,56);
		
		List<Integer> evenNum = new ArrayList<Integer>();
		
		evenNum = data.stream().filter(number -> number%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		
		
		data.stream().filter(numb->numb%2==0).forEach(n->System.out.print(" "+n));
		System.out.println();
		
		data.stream().filter(numb->numb%2==0).forEach(System.out::println);
		
		
	}
}
