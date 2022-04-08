package selenium_study;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	     JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("windows.scrollBy(0,120)");
	     js.executeScript("window.scrollBy(0,120)");
		
		
		
		
	}

}
