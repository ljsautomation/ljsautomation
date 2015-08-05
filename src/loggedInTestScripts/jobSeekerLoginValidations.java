package loggedInTestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.genericFunctions;

public class jobSeekerLoginValidations {
  @Test
  public void jobSeekerLoginFunctionalities() throws Exception {
	   
				WebDriver driver = genericFunctions.login();
				genericFunctions.handleWebElements(".//*[@id='lnkLogin']", " ", driver, "click");
				genericFunctions.handleWebElements(".//*[@id='lblJsLogin']", " ", driver, "click");
				
				genericFunctions.handleWebElements("content-header-title", "Job Seeker Login", driver, "successMessageClassName");
				
				genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtloginid']", "ljskrishna@gmail.com", driver, "sendKeys");
				genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtpassword']", "Local123", driver, "sendKeys");
				genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_btnLogin']", " ", driver, "click");
				
				 genericFunctions.brokenLinkValidations(driver, driver.getCurrentUrl());
				 
				 //Assert Left Hand Menu
				 
				 
				 
				 
				 
				 
	  
  }
}
