package Inheritance;

public class Child extends Parent{
	
	public void sub (int x, int y)
	{
		System.out.println("sub is"+ (x-y));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.sub(25, 15);
		obj.sum(69, 87);

	}

}
