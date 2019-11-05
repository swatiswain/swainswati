public class History extends Person
{
	private int marks;
	
	public History(int id, String name, int marks)
	{
		super(id,name);
		this.marks = marks;	
		
	}
	
	public int getMarks()
	{
		
		return marks;
		
	}

}