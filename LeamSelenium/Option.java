package LeamSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Option {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement createbutton=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createbutton.click();
		Thread.sleep(3000);
		WebElement female=driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		Thread.sleep(3000);
		driver.quit();

		}
	

}
