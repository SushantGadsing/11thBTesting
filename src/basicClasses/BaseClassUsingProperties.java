package basicClasses;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import utilityPackage.utilityUsingProperty;

public class BaseClassUsingProperties {
	
	
	protected WebDriver driver;
	
	public void browserLaunch() throws IOException 
	
	{System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	ChromeOptions opt =new ChromeOptions();
	driver= new ChromeDriver(opt);
	driver.get(utilityUsingProperty.getDatafromPropertyFile("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.manage().window().maximize();
	Reporter.log("Browser Launch Successfully" , true);
		
	}
	
	public void closingBrowser() {
		
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
