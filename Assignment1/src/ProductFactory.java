
public class ProductFactory 
{
    public Product getProduct(int type)
    {
    	Product p1=null;
    	if(type==1)
    	{
    		p1=new Mobile();
    	}
    	else if(type==2) 
    	{
    		p1=new Laptop();
    	}
    	return p1;
    }
}
