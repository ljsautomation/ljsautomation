package registrationTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.genericFunctions;


public class recruiterRegistration {

	    @Test
	    public void recReg() throws Exception {
	    	WebDriver driver = genericFunctions.login();

	        //Validating Recruiter/Employer Registration Process	
			genericFunctions.handleWebElements(".//*[@id='lnkRegistration']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='lblRecruiterReg']", " ", driver, "click");
			genericFunctions.handleWebElements("content-header-title", "Recruiter/Employer - Registration Form", driver, "successMessageClassName");
	        
	        //Entering the details
	        genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_ddlEmployType", "Recruiter", driver, "list");
	        
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtfirstname']", "Krishna", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtlastname']", "Avva", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtCompanyname']", "LJS", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtemail']", "ljs03@gmail.com", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtcompanyURL']", "www.localjobserver.com", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtpassword']", "Local123", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtconfirmpwd']", "Local123", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtContactNO']", "2347778901", driver, "sendKeys");
	        
	        genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_ddlindustry", "IT Software/IT Hardware", driver, "list");
	        
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtAddress']", "Hyderabad", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtCompanyProfile']", "Recruiting Website", driver, "sendKeys");
		    
		    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_flupdLogo']")).sendKeys("/Users/krishnaavva/Downloads/Happy-Smiley.jpg");
	        
	        
			genericFunctions.handleWebElements(".//*[@id='chkEmail']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='chkChat']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='chkTerms']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_btnSubmit']", " ", driver, "click");
			genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_dvsuccess", "To complete your registration, please verify your email and accept the link sent.", driver, "successMessageID");
	       driver.quit();
}
}
