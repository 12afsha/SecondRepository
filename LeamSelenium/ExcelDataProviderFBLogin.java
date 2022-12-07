package LeamSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExcelDataProviderFBLogin {

WebDriver driver;
String title1,title2;

@BeforeMethod
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		title1=driver.getTitle();
	}

@Test(dataProvider = "getData")
public void login(String uname, String pass) throws IOException
	{
	System.out.println("Inside login method");
	
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(uname)  ;
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
	
	driver.findElement(By.xpath("//button[@name='login']")).click();
	}
@AfterMethod
public void loginclose()
{
	driver.close();

}
@DataProvider
public Object[][] getData() throws IOException
{
	
	File src=new File("G:\\ST\\MST\\Book1.xlsx");
	FileInputStream fis2=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(fis2);
	XSSFSheet sheet=wb.getSheet("MST");
	Object[][] data= new Object[5][2];
	data[0][0]=sheet.getRow(1).getCell(0).getStringCellValue();
	data[0][1]=sheet.getRow(1).getCell(1).getStringCellValue();
	data[1][0]=sheet.getRow(2).getCell(0).getStringCellValue();
	data[1][1]=sheet.getRow(2).getCell(1).getStringCellValue();
	data[2][0]=sheet.getRow(3).getCell(0).getStringCellValue();
	data[2][1]=sheet.getRow(3).getCell(1).getStringCellValue();
	data[3][0]=sheet.getRow(4).getCell(0).getStringCellValue();
	data[3][1]=sheet.getRow(4).getCell(1).getStringCellValue();
	data[4][0]=sheet.getRow(5).getCell(0).getStringCellValue();
	data[4][1]=sheet.getRow(5).getCell(1).getStringCellValue();

return data;

}
}
