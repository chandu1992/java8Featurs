package programs;

import java.util.Arrays;
import java.util.List;

public class SkipFirstTwoName {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Pande","Shende","Chandu","Gauri");
		names.stream().skip(2).forEach(name -> System.out.println(name)); // Chandu Gauri 
		
	}
}
