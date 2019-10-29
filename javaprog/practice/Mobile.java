public class Mobile extends Gadgets
{
	private int modelno;
	
	public Mobile(double price, String company, int modelno)
	{
		super(price,company);
		this.modelno = modelno;
		
	}
	
	public int getModelno()
	{
		
		return modelno;

	
	}


}