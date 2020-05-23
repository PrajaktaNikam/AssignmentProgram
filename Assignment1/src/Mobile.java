
public class Mobile implements Product
{

	@Override
	public void productType() 
	{
		System.out.println("Product type is mobile");

	}

	@Override
	public void productCost(double price)
	{
		double gst=price*0.10;
		double actualPrice=price+gst;
	    System.out.println("Product price is "+actualPrice);
	

	}

}
