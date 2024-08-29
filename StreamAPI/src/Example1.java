import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {

		List<Integer> data = new ArrayList<>();
		data.add(10);
		data.add(11);
		data.add(12);
		data.add(13);
		data.add(14);
		System.out.println(data);
		
		List<Integer> l =data.stream().filter(I -> (I%2)==0).collect(Collectors.toList());
		
		System.out.println(l);
		
	List<Integer> l1 =data.stream().map(I -> I*2).collect(Collectors.toList());
		
		System.out.println(l1);
	}

}
