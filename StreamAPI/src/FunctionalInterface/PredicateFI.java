package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateFI {

	public static void main(String[] args) {
		
		String[] name = {"Suraj","Dananjay","Nikki","Varsha","Gansham"};
		
		Predicate <String> p = n-> n.length() > 6;
		
		for(String nav: name) {
			
			if(p.test(nav)) {
				System.out.println(nav+" length is : "+nav.length());
			}
		}
	}
}
