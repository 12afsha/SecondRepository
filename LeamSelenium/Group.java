package LeamSelenium;

import org.testng.annotations.Test;

public class Group {
	@Test(groups = "Regression")
	public void a() 
	{
		System.out.println("Inside a login");
	}
@Test(groups = "Smoke")	
	public void b() 
	{
		System.out.println("Inside a Register");

	}
@Test(groups = "Regression and Sanity")	
public void c() 
{
	System.out.println("Inside a Regi");

}
@Test(groups="Regression")
public void d() 
{
	System.out.println("Inside a d");
}

	
}
