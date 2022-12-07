package LeamSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QADemoTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://demoqa.com/webtables");
				driver.manage().window().maximize();
				System.out.println("");
				List<WebElement> table = driver.findElements(By.xpath("//div[@role='grid']"));
				WebElement first=driver.findElement(By.xpath("//div[text()='Alden']"));
				//System.out.println("Size of table is:"+table.size());
				System.out.println("First Name:"+first.getText());
				System.out.println("last Name:"+driver.findElement(By.xpath("//div[text()='Cantrell']")).getText());
				System.out.println("Age:"+driver.findElement(By.xpath("//div[text()='45']")).getText());
				System.out.println("EmailID:"+driver.findElement(By.xpath("//div[text()='alden@example.com']")).getText());
				System.out.println("Salary:"+driver.findElement(By.xpath("//div[text()='12000']")).getText());
				Thread.sleep(3000);
				driver.quit();
	
				



				for (int i = 0; i < table.size(); i++) {
					
				}
	}

}
