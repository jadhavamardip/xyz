package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class AddTwoClassInXml {
  @Test (priority = 1)
  public void z() {
	  System.out.println("second first test");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("second after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("second before class");
  }

  @AfterClass 
  public void afterClass() {
	  System.out.println("second after class");
  }

  @AfterSuite 
  public void afterSuite() {
	  System.out.println("second after suit");
  }
  @Test(priority = 2)
  public void p () {
	  System.out.println("second second test");
  }
}
