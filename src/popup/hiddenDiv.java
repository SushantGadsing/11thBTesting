package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDiv {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
          
          
          WebDriver driver=new ChromeDriver();
          
          driver.get("https://www.flipkart.com/");
          
          driver.manage().window().maximize();

          driver.findElement(By.xpath(" //button[@class='_2KpZ6l _2doB4z']")).click();
	}
}
