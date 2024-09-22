package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String designarion;
	String salary;
	public Employee(String name, String designarion, String salary) {
		super();
		this.name = name;
		this.designarion = designarion;
		this.salary = salary;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDesignarion() {
		return designarion;
	}



	public void setDesignarion(String designarion) {
		this.designarion = designarion;
	}



	public String getSalary() {
		return salary;
	}



	public void setSalary(String salary) {
		this.salary = salary;
	}



	@Override
    public boolean equals(Object obj) {
        Employee e = (Employee)obj;
        
        if(name.equals(e.name) && designarion.equals(e.designarion)&& salary.equals(e.salary))
        return true;
        else 
        	return false;
    }
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}

public class PredicateIsEqualAndNotStaticMethod {

	public static void main(String[] args) {
		
		Predicate<String> p = Predicate.isEqual("Chandra");
		
		System.out.println(p.test("Chandra"));
		System.out.println(p.test("Gauri"));
		
		System.out.println("================================================");
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Chandra","CEO","30000000"));
		
	
		
		Employee e1 = new Employee("Chandra","CEO","30000000");
		Employee e2 = new Employee("Gaur","HR","30000000");
		
		System.out.println("Who is a CEO ?");
		
		System.out.println(e1.getName() +"==>"+e1.getDesignarion()+"("+isCEO.test(e1)+")");
		System.out.println(e2.getName() +"==>"+e2.getDesignarion()+"("+isCEO.test(e2)+")");
		
		System.out.println("===============================================");
		
		System.out.println("Who is not CEO ? ");
		
		List<Employee> employees = Arrays.asList(e1,e2);
		
		 Predicate<Employee> isHr = employee -> "CEO".equals(employee.getDesignarion());

	        // Predicate to filter employees who are NOT CEOs using Predicate.not()
	        Predicate<Employee> isNotCEO = Predicate.not(isCEO);

	        // Filter and print employees who are not CEOs
	        employees.stream()
	                 .filter(isNotCEO)
	                 .forEach(e -> System.out.println(e.getName() + " - " + e.getDesignarion()));

		
	}
}
