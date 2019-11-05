package Inheritance;

public class Employee extends Person {
	
	
	private double salary;
	

	public Employee (int id, String name, double  salary) {

		super(id,name);
		this.salary = salary;	
	}
	public double getSalary()
	{
		return salary;
	
	}
	
}
