package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathstudy2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(3000);
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("mission successfull");
		
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("i dont know");
		
	}

}
