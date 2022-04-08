import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxAndDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Pushpa");
		driver.findElement(By.name("lastname")).sendKeys("Pushparaj");
		
		driver.findElement(By.name("reg_email__")).sendKeys("MaiZukegaNaiSala.MeraAdda.com");
		
		 WebElement Day = driver.findElement(By.id("day"));
		 
		 Select s=new Select(Day);
		 
		
		 s.selectByIndex(25);
		 
		 
	 WebElement Month = driver.findElement(By.id("month"));
		 Select m=new Select(Month);
		 
		 m.selectByValue("6");
		 
		 
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();		
	}

}
