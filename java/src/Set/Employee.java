package Set;

import java.util.TreeSet;

public class Employee {

	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		Employee e1 = new Employee(105,"john",94122);
		Employee e2 = new Employee(106,"karan",45000);
		Employee e3 = new Employee(107,"amrit",80000);
		Employee e4 = new Employee(108,"manaka",15000);
		Employee e5 = new Employee(109,"mayank",64000);
		Employee e6 = new Employee(110,"araun",85000);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		
		System.out.println(ts);

	}

}
