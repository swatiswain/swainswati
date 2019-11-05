package Inheritance;

public class Student extends Person {
	
	private int marks;
	
	public Student(int id, String name, int marks)
	{
		super(id,name);
		
	}
	 public int getMarks()
	 {
		 return marks;
	 }
	

}
