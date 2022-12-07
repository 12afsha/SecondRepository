package LeamSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabelHandling {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		List<WebElement> companyname = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		List<WebElement> group = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
		List<WebElement> prevclose = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
		List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		List<WebElement> change = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));


		
		System.out.println("Number of rows:"+companyname.size());
		String expectedname="Neuland Laborat";
		for (int i = 0; i < companyname.size(); i++) {
			String actualname=companyname.get(i).getText();
			
			if(actualname.equals(expectedname))
			{
				System.out.println("\nMy company name is :"+actualname+"\tGroup is:"+group.get(i).getText()
						+"\tPrev Close is:"+prevclose.get(i).getText()+"\tCurrent Price is: "+currentprice.get(i).getText()
						+"\t%Change is:"+change.get(i).getText());
				
			}
			
			
		}
		driver.quit();
	}

}
