package Inheritance;

public class Client extends Person {
	
	

	public Client(int id, String name, int marks) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student obj =  new Student(101,"ravi",64);
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getMarks());
		
		Employee obj2 =  new Employee(105,"ravi",65400);
		System.out.println(obj2.getId()+" "+obj2.getName()+" "+obj2.getSalary());

	}


}
