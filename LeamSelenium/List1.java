package LeamSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );

		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement option=driver.findElement(By.xpath("//div[text()='Select Option']"));
		Select selectopt=new Select(option);
		selectopt.selectByIndex(1);
		selectopt.selectByValue("5");
		



	}

}
