package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kitetest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		KiteLogInPage login= new KiteLogInPage(driver);
		
		login.enterUserID();
		login.enterPAssword();
		login.clickOnLoginButtton();
		
		Thread.sleep(1000);
		kitepinpage pin= new kitepinpage(driver);
		pin.sendPin();
		pin.clickOnContinueButton();
		
		Thread.sleep(1000);
		kitehomepage home= new kitehomepage(driver);
		
		home.validateUserID();
		home.clickOnLogout();
		


	}

	}


