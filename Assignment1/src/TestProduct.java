import java.util.Scanner;

public class TestProduct 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Select Product Type");
		System.out.println("1:Mobile");
		System.out.println("2:Laptop");
	    int choice=scan.nextInt();
	      
	    
		ProductFactory f1=new ProductFactory();
		Product p=f1.getProduct(choice);
		if(p!=null)
		{
			p.productType();
			p.productCost(10000.0);
		}
		else
		{
			System.out.println("You entered wrong choice");
		}
		
	}

}
