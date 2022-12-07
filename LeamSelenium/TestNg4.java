package LeamSelenium;

import org.testng.annotations.Test;

public class TestNg4 {
	@Test
	public void a() 
	{
		System.out.println("Inside a login");
	}
@Test(enabled=false)	
	public void b() 
	{
		System.out.println("Inside a Register");

	}
@Test(invocationCount = 3, priority = 2)	
public void c() 
{
	System.out.println("Inside a Regi");

}

	
}
