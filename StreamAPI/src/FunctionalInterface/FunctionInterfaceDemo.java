package FunctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f = d -> d*d;
		System.out.println(f.apply(5));
		
		Function<String,Integer> fun = name -> name.length();
		
		System.out.println("Length of String is : "+ fun.apply("Chandra"));
	}
}
