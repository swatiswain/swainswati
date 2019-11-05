class Student
{
	int id;
	String name;
	int marks;
	
	public Student(int p1, String p2, int p3);
	{
		id = p1;
		name = p2;
		marks = p3;
		
	}
	
	public Student()
	{
		
	}
	
	public static void main(String args[])
	{
		Student obj= new Student(442,"Smita",225);
		
		System.out.println(obj.id+" "+obj.name+" "+obj.marks);
		
		Student obj2= new Student(225,"Sriya",351);
		System.out.println(obj2.id+" "+obj2.name+" "+obj2.marks);
		
		Student obj3= new Student(492,"Ria",672);
		System.out.println(obj3.id+" "+obj3.name+" "+obj3.marks);
		
		Student obj4 = new Student();
		
	}
	
}