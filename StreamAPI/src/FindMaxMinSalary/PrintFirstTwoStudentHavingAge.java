package FindMaxMinSalary;

import java.util.ArrayList;
import java.util.List;

public class PrintFirstTwoStudentHavingAge {
	
	public static void main(String[] args) {
	List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101,"Chandra",520000.4));
		employees.add(new Employee(102,"Akash",600000.44));
		employees.add(new Employee(103,"Gauri",400000.43));
		employees.add(new Employee(103,"Arjun",4200000.45));
		employees.add(new Employee(103,"Sumit",200000.4));
		employees.add(new Employee(103,"Atul",100000.4));
		
		// print first two emp having salary more than 400000
		
		employees.stream()
		.filter(emp -> emp.getSalary()>400000)
		.map(emp -> emp.getName())
		.limit(2)
		.forEach(emp -> System.out.println(emp)); // Chandra Akash
	}

}
