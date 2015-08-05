package miscValidations;

import org.testng.annotations.Test;
import genericLibrary.genericFunctions;
import org.openqa.selenium.WebDriver;

public class footerValidations {
	  @Test
	    public void footerFeedback() throws Exception {
	    	WebDriver driver = genericFunctions.login();
	    	   genericFunctions.handleWebElements(".//*[@id='form1']/div[7]/footer/div[1]/div/div[2]/ul/li[2]/a", " ", driver, "click");
	    	   genericFunctions.handleWebElements(".//*[@id='txtfullName']","Krishna Avva", driver, "sendKeys");
	    	   genericFunctions.handleWebElements(".//*[@id='txtemail']","abc@gmail.com", driver, "sendKeys");
	    	   genericFunctions.handleWebElements(".//*[@id='txtmsg']", "abc@gmail.com", driver, "sendKeys");
	    	   genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtfirstname']", "Testing Feedback", driver, "sendKeys");
	    	   genericFunctions.handleWebElements(".//*[@id='chkexcellent']", "", driver, "click");
	    	   genericFunctions.handleWebElements(".//*[@id='btnSubmit'", " ", driver, "click");
  }
}