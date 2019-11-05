class ResultDemo
{
	public static void main(String args[])
	
	{
		Mobile obj = new Mobile(20000, "Samsung", 7);
		System.out.println(obj.getPrice()+" "+obj.getCompany()+" "+obj.getModelno());
		
		
		Laptop obj2 = new Laptop(85000, "lenevo",3);
		System.out.println(obj2.getPrice()+" "+obj2.getCompany()+" "+obj2.getVersion());
		
		
		
		
	}



}