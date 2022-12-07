package LeamSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MYFirstTestNG {
  @Test
  public void test1() {
	  System.out.println("I am inside the test1");
  }
  @Test
  public void test2() {
	  System.out.println("I am inside the test2");
  }
  @Test
  public void test3() {
	  System.out.println("I am inside the test3");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am inside the beforeMethod");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am inside the AfterMethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am inside the beforeClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am inside the afterClass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am inside the beforetest");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am inside the afterTest");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am inside the beforeSuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am inside the AfterSuite");

  }

}
