class Numdemo
{
	public static void main(String args[])
	{
		int a =10, b=20, c=25, d=32;
		if(a>b&&a>c&&a>d)
			System.out.println("greatest number is" +a);
		else if(b>c&&b>d)
			System.out.println("greatest number is" +b);
		else if(c>d)
			System.out.println("greatest number is" +c);
		else
			System.out.println("greatest number is" +d); 
		
		
	}

}