package OopsConcept;  

public class Student{
	
	int id;
	String name;
	int marks;
	
	//parameterized constructor	
	public Student(int p1, String p2, int p3)
	{
		id = p1;
		name = p2;
		marks = p3;
	}
	
	public Student()
	{
		
	}
	public static void main(String... args)
	{
		
		Student3 obj = new Student3(101,"Raja",500);

		System.out.println(obj.id+" "+obj.name+" "+obj.marks);
		
		Student3 obj2 = new Student3(102,"Naveen",400);

		System.out.println(obj2.id+" "+obj2.name+" "+obj2.marks);
	}
}

