package FindMaxMinSalary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GetSalaryGraterThanFiveLPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(101,"Chandra",520000.4));
		employees.add(new Employee(102,"Akash",600000.44));
		employees.add(new Employee(103,"Karishma",400000.43));
		employees.add(new Employee(103,"Arjun",4200000.45));
		employees.add(new Employee(103,"Sumit",200000.4));
		employees.add(new Employee(103,"Atul",100000.4));
		
		//salary is grater than 200000
		List<Double> employeeSalaryList = employees.stream().filter((employee)-> employee.getSalary() > 200000).map((employee)->employee.getSalary()).collect(Collectors.toList());

		System.out.println(employeeSalaryList);
		
		employees.stream().filter(employee -> employee.getSalary()== 4200000.4).forEach(employee -> System.out.println("employee "+employee.getName()+" has salary : "+employee.getSalary()));
		
		double totalSalary = employees.stream().collect(Collectors.summingDouble(employee ->employee.getSalary()));
		System.out.println("Sum of salary : "+totalSalary);
		
		
		Employee employee = employees.stream().max((employee1,employee2) -> employee1.getSalary() > employee2.getSalary() ? 1 : -1).get();
		System.out.println(employee.getName()+ " employee has max salary "+employee.getSalary());
		
		Employee employeemin = employees.stream().max((employee1,employee2) -> employee1.getSalary() > employee2.getSalary() ? -1 : 1).get();
		System.out.println(employeemin.getName()+ " employee has min salary "+employeemin.getSalary());
		
		Set<Double> empSet = employees.stream().filter((employeeData)-> employeeData.getSalary() > 200000.4).map((employeeData)->employeeData.getSalary()).collect(Collectors.toSet());
		System.out.println(empSet);
	
		
		Map<String,Double>  employeeSalMap = employees.stream().collect(Collectors.toMap(p-> p.getName(), p-> p.getSalary()));
		System.out.println(employeeSalMap);
		
		List<Double> empSal = employees.stream().filter(p -> p.getSalary()>400000.45).map(Employee::getSalary).collect(Collectors.toList());
		System.out.println(empSal);
		
		//returns true or false if all conditions are satisfied
		Predicate<Employee> e = emp -> emp.getSalary() < 520000.3 && emp.getName().equals("Akash");
		System.out.println(e.test(new Employee(102,"Akash",600000.44)));
		
		
	}

}
