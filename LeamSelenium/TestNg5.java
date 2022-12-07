package LeamSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg5 {
	@Test
	public void login()
	{
		Assert.assertFalse(true);
		System.out.println("Login Successful");
	}
	@Test(dependsOnMethods ="login" )
	public void payment() {
		System.out.println("Payment is done");
	}
}
