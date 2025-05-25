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
		/** { Chandra=[Student [name=Chandra, city=New York, age=33], Student [name=Chandra, city=Sangamner, age=10]],
		      Gauri=[Student [name=Gauri, city=London, age=27]], 
		      Poorva=[Student [name=Poorva, city=Paris, age=30]], 
		      Raj=[Student [name=Raj, city=Paris, age=19]], 
		      Akash=[Student [name=Akash, city=New York, age=29]], 
		      Om=[Student [name=Om, city=London, age=25]]} **/
		
		Map<String,Long> data2 = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
		System.out.println(data2);
		// {Chandra=2, Gauri=1, Poorva=1, Raj=1, Akash=1, Om=1}
		
		Map<String, List<String>> namesByAge = students.stream()
			    .collect(Collectors.groupingBy(
			    		Student::getName,
			        Collectors.mapping(Student::getCity, Collectors.toList())
			    ));

		System.out.println(namesByAge);
		// {Chandra=[New York, Sangamner], Gauri=[London], Poorva=[Paris], Raj=[Paris], Akash=[New York], Om=[London]}
		
		

		System.out.println(students.stream().collect(Collectors.counting())); // 7


	}

}
