package utilityPackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	Sheet Mysheet;
	public static String readDataFromExcel(int rowIndex, int columnInex) throws EncryptedDocumentException, IOException 
	{
		
		
		FileInputStream MyFile =new FileInputStream("D:\\excelbook\\myexcel.xlsx");		
		
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String Value = Mysheet.getRow(rowIndex).getCell(columnInex).getStringCellValue();
		
		return Value;
		
		
		
		
	}
	
	public static void 	takeScreenshot(WebDriver driver ,int TCID) throws IOException 
	
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest =new File("D:\\excelbook\\fbimage "+TCID+".png");
		FileHandler.copy(src, dest);
		Reporter.log("Screenshot taken of TC"+TCID,true);
		
	}
	
	
}

