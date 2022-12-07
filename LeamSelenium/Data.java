package LeamSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Data {

WebDriver driver;
File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Selenium\\Test.properties");
FileInputStream fis;
Properties pro=new Properties();
String title1,title2;

@BeforeMethod
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(pro.getProperty("URL"));
	driver.manage().window().maximize();
	title1=driver.getTitle();
	}
@Test(dataProvider = "getData")
public void login(String uname, String pass) throws IOException
	{
	System.out.println("Inside login method");
	
	WebElement email=driver.findElement(By.xpath(pro.getProperty("XpathEmail")));
	email.sendKeys(uname)  ;
	driver.findElement(By.xpath(pro.getProperty("XpathPassword"))).sendKeys(pass);
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	

	}
@AfterMethod
public void loginclose()
{
	driver.close();

}
@DataProvider
public Object[][] getData() throws IOException
{
	System.out.println("Inside Setup");
	fis =new FileInputStream(file);
	pro.load(fis);

	Object[][] data= {{pro.getProperty("Uname1"), pro.getProperty("Pass1")},{pro.getProperty("Uname2"), pro.getProperty("Pass2")},{pro.getProperty("Uname3"), pro.getProperty("Pass3")},
			{pro.getProperty("Uname4"), pro.getProperty("Pass4")}};
return data;

}
}
