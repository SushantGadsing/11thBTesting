package basicClasses;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass {

	protected WebDriver driver;
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		driver= new ChromeDriver(options);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
							
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		Reporter.log("Browser launch successfull", true);
		
		
	}
	public void browserclose()
	{
		driver.close();


}    
}
