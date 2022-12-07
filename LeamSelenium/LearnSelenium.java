package LeamSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Online_Java_Selenium\\Test.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties pro=new Properties();
		pro.load(fis);
		
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

	driver.get(pro.getProperty("URL"));
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	  String title=driver.getTitle(); Thread.sleep(3000);
	  System.out.println(title); String url=driver.getCurrentUrl();
	  Thread.sleep(3000); System.out.println(url);
	 	WebElement email=driver.findElement(By.xpath(pro.getProperty("XpathEmail")));
	email.sendKeys(pro.getProperty("EmailId"));
	Thread.sleep(3000);
	
	WebElement pass=driver.findElement(By.xpath(pro.getProperty("XpathPassword")));
	pass.sendKeys(pro.getProperty("Password"));
	Thread.sleep(5000);
	WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
		Thread.sleep(5000);
		
		String title2=driver.getTitle();
		if(title.equals(title2))
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		}
		driver.close();

	}

}
