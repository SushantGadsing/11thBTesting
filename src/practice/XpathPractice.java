package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
//		
//	 driver.findElement(By.xpath("//input[@id='email']"));
////	 
//	 typeMessage.click();
//	 typeMessage.sendKeys("hi");
//		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		String title = driver.getTitle();
        System.out.println("title of site is "+title);
        String url = driver.getCurrentUrl();
        System.out.println("url of current site is "+url);
		
		
		
		
		
	}

}
