package testNGXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest123 
{
  @Test(groups="regression")
  public void tc1()
{Reporter.log("Running regression ", true);
  }
  
  @Test(groups="sanity")
  public void tc2() 
  {
	  
	  Reporter.log("Running sanity ", true);
  }
  
  @Test(groups="regression")
  public void tc3() {
	  
	  Reporter.log("Running regression ", true);
  }
  
  
  
  @Test(groups="sanity")
  public void tc4() {
	  
	  Reporter.log("Running sanity ", true);
  }
}
