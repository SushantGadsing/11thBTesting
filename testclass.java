import org.testng.Reporter;
import org.testng.annotations.Test;

import basicClasses.BaseClassUsingProperties;
import utilityPackage.utilityUsingProperty;

public class testclass extends BaseClassUsingProperties{
  @Test
  public void f () {
	  
      Reporter.log(utilityUsingProperty.getDatafromPropertyFile("URL"),true);
	  
	  
	  
  }
}
