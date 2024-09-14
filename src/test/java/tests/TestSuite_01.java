package tests;

import org.testng.annotations.Test;

import utils.BrowserUtils;

public class TestSuite_01 {
  @Test
  public void testCase1() {
	 //open browser
	  BrowserUtils.openBrowser();
	 //invoke app
	  BrowserUtils.invokeApp();
	  //verify login page
	  LoginPage.verifyLoginPage();
	  //perform login
	  //verify login successfull
	  //logout from app
	  //close browser
	  BrowserUtils.killBrowser();
	  
	  
  }
}
