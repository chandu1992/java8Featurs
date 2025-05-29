package FilterStreamAPI;

import java.util.Arrays;
import java.util.List;

public class TakeWhile {

	public static void main(String[] args) {
		
		List<Integer> names = Arrays.asList(10,20,30,40,50,21,12,22,35);
		names.stream().takeWhile(n -> n<30).forEach(n->System.out.print(n+",")); // 10,20
		
		
	}
}
