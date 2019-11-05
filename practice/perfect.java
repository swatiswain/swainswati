class Perfect
{
	
	public static void main(String args[])
	{
		int n =3569;
		int sum = 0,mul = 1;
		while(n>0)
		{
			int r =n%10;
			sum = sum+r;
			mul = mul*r;
			n=n/10;

		}
		if(sum==mul)
			System.out.println("given no is perfect");
		else
			System.out.println("given no is not perfect");
		
		
	}
}