package LeamSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test
		public void readExcelData() throws IOException
		{
			File src=new File("G:\\ST\\MST\\Book1.xlsx");
			FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet("MST");
			String s = sheet.getRow(1).getCell(1).getStringCellValue();
			System.out.println("Data Coming From EXcel is "+s);
			System.out.println(sheet.getLastRowNum());			
			System.out.println(sheet.getPhysicalNumberOfRows());			
			System.out.println(sheet.getRepeatingRows().getLastColumn());			
			System.out.println();			
			System.out.println();			

		}
}
