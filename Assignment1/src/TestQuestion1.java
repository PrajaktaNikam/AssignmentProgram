import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class TestQuestion1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name=scan.next();
		System.out.println("Enter employee Age ");
		int age=scan.nextInt();
		String age1=String.valueOf(age);
		FileWriter fw=null;
		Properties prop=new Properties();
		try
		{
			fw=new FileWriter("E:\\Praju\\Qspider\\J2EE\\Practical\\Sample1.Properties");
			//prop.setProperty("EmployeeName", name);
			//prop.setProperty("EmployeeAge", age1);
			prop.setProperty(name, age1);
			 prop.store(fw, "External file");
			System.out.println("Properties file created successfully");
			//System.out.println("Employee Name is "+name);
			//System.out.println("Employee Age is "+age);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(fw!=null)
			{
				try
				{
					fw.close();
				}
				catch(IOException e)
				{
				   e.printStackTrace();	
				}
			}
		}
		
	}

}
