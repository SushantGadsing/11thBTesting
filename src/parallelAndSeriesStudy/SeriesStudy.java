package parallelAndSeriesStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeriesStudy {
  @Test
  public void test1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(300);
	  driver.close();
	
  }
  @Test
  public void test2() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(300);
	  driver.close();
  
  }
  
  @Test
  public void test3() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(300);
	  driver.close();
  
  
  
}
}




