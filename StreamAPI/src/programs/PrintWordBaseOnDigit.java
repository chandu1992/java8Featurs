package programs;

import java.util.stream.Stream;

public class PrintWordBaseOnDigit {

	public static void main(String[] args) {
		
		Stream<Integer> digits = Stream.of(1,2,3,4,5,6);
		
		digits.map(num ->{
			switch(num) {
			case 1: 
				return "one";
			case 2: 
				return "Two";
			case 3: 
				return "Three";
			case 4: 
				return "Four";
			case 5: 
				return "Five";
			case 6: 
				return "Six";
			default:
				return "wrong input";
			}
		}).forEach(num -> System.out.println(num));
	}
}
