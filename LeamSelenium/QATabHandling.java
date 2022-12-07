package LeamSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QATabHandling {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Admin\\\\\\\\Downloads\\\\\\\\Selenium\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(); //Object of chromeDriver class we stored in WebDriver Interface
			driver.navigate().to("https://demoqa.com/browser-windows"); //to launch the url in application 
			Thread.sleep(3000); //it will wait for 3 seconds 
			driver.manage().window().maximize(); //maximize the window or browser 
			Thread.sleep(3000);
			System.out.println("Title of old Tab open"+driver.getTitle()); 
			driver.findElement(By.xpath("//button[@id='tabButton']")).click(); //Store address of main window 
			
			String mainWindow = driver.getWindowHandle(); //All the windows
			Set<String> allWindow = driver.getWindowHandles(); //total two address --->1---->main 2--->new open 
			
			System.out.println("How many Tabs are open currently:--->"+allWindow.size()); //To navigate to newly open window 
			for (String window : allWindow) { //2 value -one is mainwindow 
				if(window.equals(mainWindow)) { 
					
				} 
				else 
				{ driver.switchTo().window(window); } 
				}
			System.out.println("Title of new Tab open"+driver.getTitle()); //Capture the text from new window }
			//System.out.println("Page Contents:"+mainWindow.);
			}
		

	}


