package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String MainwindowId = driver.getWindowHandle(); // this give page ID of single page
		
		System.out.println("this is main page window id  "+MainwindowId);
		
		driver.findElement(By.name("NewWindow")).click();
		 
		Set<String> AllwindowId = driver.getWindowHandles();
		
		System.out.println("this is all windows ID  "+AllwindowId);
		
		Iterator<String> it = AllwindowId.iterator();
		String mainpageid = it.next();
	    String childpageid = it.next();
	    
	    driver.switchTo().window(childpageid);
	    
	    Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().window(mainpageid);
		
		
		
		
		
		
	
	}

}
