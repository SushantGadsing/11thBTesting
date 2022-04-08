package testNGXmlStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failXmlStudy {
	@Test
	  public void tc1() {
		  
		  Reporter.log("Running TC1 ", true);
	  }
	  
	  @Test(timeOut =500)
	  public void tc2() throws InterruptedException {
		  Thread.sleep(200);
		  Reporter.log("Running TC2 ", true);
	  }
	  
	  @Test
	  public void tc3()
        {
		  
		  Reporter.log("Running TC3 ", true);
	  }
	  
	  
	  
	  @Test
	  public void tc4() {
		  
		  Reporter.log("Running TC4 ", true);
		  Assert.fail();
	  }
	  
}
