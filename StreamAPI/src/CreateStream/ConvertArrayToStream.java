package CreateStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStream {

	public static void main(String[] args) {
		
		String[] countries = {"India","Pakistan","USA","AUS"};
		Stream<String> s = Arrays.stream(countries);
		
		s.forEach(System.out::println);
		
		Stream<String> s2 = Stream.of("Bhau","Sangita","chandu","Gauri","Vrinda","Pooja","Anuj");
		s2.forEach(System.out::println);

	}
}
