
public class Laptop implements Product 
{
	@Override
	public void productType() 
	{
		
      System.out.println("product type is laptop");
	}
	@Override
	public void productCost(double price)
	{
		double gst=price*0.05;
		double actualPrice=price+gst;
	    System.out.println("Product price is "+actualPrice);
	}
}
