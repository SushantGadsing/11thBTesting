package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		  Alert alt = driver.switchTo().alert();	
		  
		  System.out.println("this is alert text "+(alt.getText()));
		  
		  alt.accept();		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		

	}

}
