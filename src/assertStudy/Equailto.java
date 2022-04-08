package assertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Equailto {
  @Test
  public void tc1() {
	  
	  String a="sushant";
	  String b= "sushant";
	  
	Assert.assertEquals(a, b ,"a and b is Not Equal");
  }
  
  @Test
  public void tc12() {
	  
	  String a="Sushant";
	  String b= "sushant";
	  
	Assert.assertNotEquals(a, b ,"a and b is Not Equal");
  }
}
