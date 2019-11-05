package OopsConcept;

public class Student3 {
	
	int id;
	String name;
	int marks;
	
	
	public Student3(int p1,String p2, int p3)
	{
		id = p1;
		name= p2;
		marks = p3;
	}
	
	public Student3()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student3 obj = new Student3(101,"raja",452);
		System.out.println(obj.id+" "+obj.name+" "+obj.marks);

	}

}
