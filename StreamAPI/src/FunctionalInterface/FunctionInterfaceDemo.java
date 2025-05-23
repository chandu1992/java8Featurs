package FunctionalInterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {

	
	public static void main(String[] args) {
		
		Function<Integer,Integer> f = d -> d*d;
		System.out.println(f.apply(5));
		
		Function<String,Integer> fun = name -> name.length();
		
		System.out.println("Length of String is : "+ fun.apply("Chandra"));
		
		
		Function<Integer,Integer> f1 = num -> 2 * num;
		Function<Integer, Integer> f2 = num -> num * num * num ;
		
//		Function<Integer,Integer> stringFun = f1.andThen(f2);
//		System.out.println(stringFun.apply(4));
		
		System.out.println(f1.andThen(f2).apply(3)); //216
		System.out.println(f2.andThen(f1).apply(3)); //54
		System.out.println(f1.compose(f2).apply(3)); //54 ̑›
		
		Function<String,String> identityFun = Function.identity();
		System.out.println(identityFun.apply("Chandu")); //chandu
		
		
	}
}
