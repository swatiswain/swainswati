class Base
{
	public void doWork(int x)
	{	
		System.out.println("square values is"+ (x*x));
	
	}

}
class Derived extends Base
{
	public void doWork(int x)
	{
		System.out.println("adding values"+(x+x));

	}
	public static void main(String args[])
	{
		Base obj = new Derived();
		obj.doWork(9);
	
	}


}