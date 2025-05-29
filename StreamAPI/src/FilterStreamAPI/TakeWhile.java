package FilterStreamAPI;

import java.util.Arrays;
import java.util.List;

public class TakeWhile {

	public static void main(String[] args) {
		
		List<Integer> names = Arrays.asList(10,20,30,40,50,21,12,22,35);
		names.stream().takeWhile(n -> n<30).forEach(n->System.out.print(n+",")); // 10,20
		
		System.out.println();
		
		
		List<Integer> data = Arrays.asList(10,20,30,40,50,10,20,30);
		data.stream().distinct().forEach(n->System.out.print(n+" ")); //10 20 30 40 50 
		
		
		List<String> monthData = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August");
		boolean check = monthData.stream().anyMatch(month -> month.length()>=8);
		System.out.println(check); // true
		
		
		List<String> monthData2 = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August");
		boolean check2 = monthData2.stream().allMatch(month -> month.length()!=4);
		System.out.println(check2); //false (June has 4 length)
		
		
	}
}
