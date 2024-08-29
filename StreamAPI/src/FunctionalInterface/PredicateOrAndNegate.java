package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateOrAndNegate {

	public static void main(String[] args) {
		int[] arr = {10,0,5,20,25,30,35};
		
		Predicate<Integer> p1 = i -> i%2==0;
		Predicate<Integer> p2 = i -> i>10;
		//and() or() & negate()
		System.out.println("The nubers which is even and > 10 are : ");
		
		for(int x1: arr) {
			if(p1.and(p2).test(x1)) {
				System.out.print(x1+"  ");
			}
		}
		System.out.println();
		System.out.println("The nubers which is even or > 10 are : ");
		
		for(int x1: arr) {
			if(p1.or(p2).test(x1)) {
				System.out.print(x1+"  ");
			}
		}
		
		System.out.println();
		System.out.println("The nubers which is not even : ");
		
		for(int x1: arr) {
			if(p1.negate().test(x1)) {
				System.out.print(x1+"  ");
			}
		}
	}
}
