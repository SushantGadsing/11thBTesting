package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathstudy {

	public static void main(String[] args) throws InterruptedException {
	
           System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
           
           
           WebDriver driver=new ChromeDriver();
           
           driver.get("https://www.facebook.com/");
           
           driver.manage().window().maximize();
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//input[@id='email']")).sendKeys("your_right_bro@gamil.com");
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("I don't Know");
           
           Thread.sleep(3000);
           
           driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
