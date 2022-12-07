package LeamSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class STC_Tourism {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nichethyself.com/tourism/home.html");
		Thread.sleep(3000);
		String title=driver.getTitle();
		Thread.sleep(3000);
		System.out.println(title);
		
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("stc123");
		Thread.sleep(3000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("12345");
		Thread.sleep(5000);
		
		WebElement submit=driver.findElement(By.xpath("(//button[text()='Submit'])[3]"));
			submit.click();
			Thread.sleep(5000);
			
			String title2=driver.getTitle();
			if(title.equals(title2))
			{
				System.out.println("Test case is "+ "");
			}
			else
			{
				System.out.println("Test Case is Passed");
			}
			driver.close();



	}

}
       