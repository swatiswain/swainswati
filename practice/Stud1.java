  class Stud1
  {
	  int id;
	  String name;
	  int marks;
	  
	  
	  public Stud1(int p1, String p2, int p3)
	  {
		  id = p1;
		  name = p2;
		  marks = p3;
		  
	  }

	 
	 public Stud1()
	 
	 {
		  
		  
	  }
	  
	  
	  public static void main(String... args)
		{
			
			Stud1 obj = new Stud1(101,"Raja",500);

			System.out.println(obj.id+" "+obj.name+" "+obj.marks);
			
			Stud1 obj2 = new Stud1(102,"Naveen",400);

			System.out.println(obj2.id+" "+obj2.name+" "+obj2.marks);
			
			Stud1 obj4 = new Stud1();
		}
			
  
  
  
  }