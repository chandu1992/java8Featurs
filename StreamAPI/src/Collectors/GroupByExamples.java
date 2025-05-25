package Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExamples {
	
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
			    new Student("Chandra", "New York", 33),
			    new Student("Chandra", "Sangamner", 10),
			    new Student("Gauri", "London", 27),
			    new Student("Akash", "New York", 29),
			    new Student("Om", "London", 25),
			    new Student("Poorva", "Paris", 30),
			    new Student("Raj", "Paris", 19)
			);
		
		
		Map<String, List<Student>> data = students.stream().collect(Collectors.groupingBy(Student::getName));
		System.out.println(data);
		




	}

}
