package LeamSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Afsha Naz Shaikh");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("afshashaikh1203@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Solapur");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Solapur");
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();",submit); 
		  js.executeScript("window.scrollBy(0,600)");
		  Thread.sleep(3000);
		  driver.quit();
		
	}

}
