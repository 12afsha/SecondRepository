package LeamSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		 
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(bm);
		month.selectByVisibleText("Mar");
		Thread.sleep(3000);
		month.selectByIndex(10);
		Thread.sleep(3000);
		month.selectByValue("12");
		Thread.sleep(3000);
//Second way to handle same
		
		WebElement b=driver.findElement(By.xpath("//select[@id='month']"));
		Select months=new Select(b);
		List<WebElement> drpdwn = months.getOptions();
		
		for (int i = 0; i < drpdwn.size(); i++) {
			WebElement a = drpdwn.get(i);
			System.out.println(a.getText());
			String drpdownva= a.getText();
			
			if(drpdownva.equals("Ang"))
			{
				a.click();
			}
				
		}
		//3rd
		System.out.println(months.isMultiple());
		months.selectByIndex(0);
		months.selectByValue("7");
		months.deselectByVisibleText("Feb");
		System.out.println(months.getFirstSelectedOption().getText());
		
		
		//4thwy to
		b.sendKeys("Mar");		
		//5th way 
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");

	}

}