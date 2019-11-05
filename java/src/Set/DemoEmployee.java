package Set;

public class DemoEmployee{

	
		// TODO Auto-generated method stub
		
		private int id;
		private String name;
		private double sal;
		
		
		public String toString()
		{
			
			return id+" "+name+" "+sal;
			
		}
		public DemoEmployee(int id, String name,double sal)
		{
			super();
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
			
			public int getId()

			{
				return id;
				
			}
			
			public String getName()
			{
				return name;
			}
	
			public double getSal()
			{
				return sal;
				
			}
			
			public static void main(String[] args) {
				
				DemoEmployee obj = new DemoEmployee(101, "Surya", 50000);
				System.out.println(obj.getId()+" "+obj.getName());
				
				
			}
		
		
		
	
}
	