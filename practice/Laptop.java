public class Laptop extends Gadgets
{
	
	
	private int version;
	
	public Laptop(double price, String company, int version)
	{
		super(price,company);
		this.version = version;
	
	}
	
	
	public int getVersion()
	{
		
		return version;
		
	}



}