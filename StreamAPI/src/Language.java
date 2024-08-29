import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Language {


	public static void main(String[] args) {

		List<String> lang = new ArrayList<>();

		lang.add("English");
		lang.add("Marathi");
		lang.add("German");
		lang.add("Egiptyen");

		System.out.println(lang);
		List<String> newList = lang.stream().filter(item -> item.startsWith("E")).collect(Collectors.toList());

		System.out.println(newList);
		
//		==================================================================================================================
		
		long count = lang.stream().filter(item -> item.startsWith("E")).count();
		System.out.println(count);
		
//		==================================================================================================================

		List<String> upperList = lang.stream().map(item -> item.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperList);
		
//		==================================================================================================================

//		Integer max = Stream.of(10,20,30,32,1,55,55.4).max(Comparator.comparing(Integer::valueOf)).get();

		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 8, 55, 77);

		Integer maxValue = list.stream().max(Integer::compare).get();

		System.out.println(maxValue);
		
//		==================================================================================================================

		List<Integer> list1 = Arrays.asList(-9, -18, 0, 25, 8, 55, 77);

		Integer minValue = list1.stream().min(Integer::compare).get();

		System.out.println(minValue);
		
//		==================================================================================================================
		
		Optional<Integer> value = list1.stream().max(Comparator.reverseOrder());
		
		System.out.println(value.get());
		
//		==================================================================================================================

		
			}
}
