import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxStart {


	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.gecko.driver", "D:\\Firefox drive\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/");
	
	driver.manage().window().maximize();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}