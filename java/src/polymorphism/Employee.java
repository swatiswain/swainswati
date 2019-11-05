package polymorphism;

public class Employee extends Object
{
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj1 = new Employee(985,"Ramesh",509000);
		System.out.println(obj1.toString());
		Object obj2 = new Employee(395,"Suresh",960000);
		System.out.println(obj2.toString());
		Object obj3 = new Employee(645,"Ravi",6480000);
		System.out.println(obj3.toString());
		Object obj4 = new Employee(365,"Hari",520000);
		System.out.println(obj4.toString());
		Object obj5 = new Employee(785,"Amar",979000);
		System.out.println(obj5.toString());
		

	}

}
