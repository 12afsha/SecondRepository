package LeamSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		System.out.println("");
		System.out.println("Title of old Tab open"+driver.getTitle()); //Capture the text from new window }
	 driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		 String mainwindow = driver.getWindowHandle();
		 Set<String> allwindow = driver.getWindowHandles();
		 System.out.println("Number of Currently open window:"+allwindow.size());
		 for (String window : allwindow) {
			 if(window.equals(mainwindow))
			 {
				 
			 }
			 else
			 {
				driver.switchTo().window(window) ;
			 }
		}
		 
		 
			System.out.println("Title of new Tab open"+driver.getTitle()); //Capture the text from new window }


	}

}
