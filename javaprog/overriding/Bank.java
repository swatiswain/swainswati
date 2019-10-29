interface Bank
{
	void withdrawl();
	void balanceEnquire();
	void miniStatement();
	void deposit();
}
class SBI implements Bank
{
	public void withDrawl()
	{
		System.out.println("SBI-withDrawl");	
	}
	public void  balanceEnquire()
	{
		System.out.println("SBI-balanceEnquire");
	}
	public void miniStatement()
	{
		System.out.println("SBI-miniStatement");
	}
	public void deposit()
	{
		System.out.println("SBI-deposit");
	}
	public static void main(String args[])
	{
		Bank obj=new SBI();
		obj.withDrawl();
		obj.balanceEnquire();
		obj.miniStatement();
		obj.deposit();
	}
}
class HDFC implements Bank
{
	public void withDrawl()
	{
		System.out.println("HDFC-withDrawl");
	}
	public void  balanceEnquire()
	{
		System.out.println("HDFC-balanceEnquire");	
	}
	public void miniStatement()
	{
		System.out.println("HDFC-miniStatement");
	}
	public void deposit()
	{
		System.out.println("HDFC-deposit");
	}	
}