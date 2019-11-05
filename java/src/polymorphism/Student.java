package polymorphism;

public class Student extends Object
{
	private int id;
	private String name;
	private int marks;
	 
	
	public Student(int id, String name, int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		return id+" "+name+" "+marks;
	}
	 
	public static void main(String args[])
	{
		Object obj = new Student(101,"ayush",652);
		System.out.println(obj.toString());
		Object obj1 = new Student(109,"bittu",664);
		System.out.println(obj1.toString());
		Object obj2 = new Student(258,"yash",952);
		System.out.println(obj2.toString());
		Object obj3 = new Student(357,"harish",992);
		System.out.println(obj3.toString());
	}

	
	
	
	
	
}
