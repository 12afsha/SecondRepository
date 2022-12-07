package LeamSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebDriverWait wdw=new WebDriverWait(driver,60); //Explicit wait
			WebElement email=driver.findElement(By.xpath("//input[@id='email1']"));
			wdw.until(ExpectedConditions.visibilityOf(email));
			
		email.sendKeys("MyFirstWebElement");
		driver.close();		
	}

}





























