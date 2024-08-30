package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<String> s = str -> System.out.println(str);
		
		s.accept("chandu");
	}
}
