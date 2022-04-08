package utilityPackage;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utilityUsingProperty
{
	
	public static void takeScreenShot(WebDriver driver, int TCID) throws IOException 
	
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\excelbook\\TC"+TCID+"screenshot.png");	
		FileHandler.copy(src, dest);
		
		Reporter.log("Screenshot is taken"+TCID,true);
	}
	
	public static String getDatafromPropertyFile(String key) throws IOException
	
	{
		Properties p =new Properties();
		FileInputStream file =new FileInputStream("C:\\Users\\SUSHANT\\eclipse-workspace\\velocity 11th b\\MyFile.properties");
		p.load(file);
		String value = p.getProperty(key);
		return value;




	}
	
	
	
	
	
	
	
	
	
	
	
	
}
