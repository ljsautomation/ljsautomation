package registrationTestScripts;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.genericFunctions;


public class trainingInstituteRegistration {

	    @Test
	    public void trainingInstReg() throws Exception {
	    	WebDriver driver = genericFunctions.login();

	    	//Validating Recruiter/Employer Registration Process	
			genericFunctions.handleWebElements(".//*[@id='form1']/div[4]/div/div/ul[1]/li[4]/a", " ", driver, "click");
			
			genericFunctions.handleWebElements(".//*[@id='lnkRegistration']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='lblTrainerReg']", " ", driver, "click");
			genericFunctions.handleWebElements("content-header-title", "Training Institute Registration Form", driver, "successMessageClassName");
			
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtInstituteName']", "KCS Institute", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtfirstname']", "Krishna", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtemail']", "ljs10@gmail.com", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtContactNO']", "2347778901", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtpassword']", "Local123", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtconfirmpwd']", "Local123", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtTrainerLocation']", "Hyderabad", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtkeywords']", "Java, DOT NET", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtAddress']", "Hyderabad, Telangana", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_flUpdPhoto']", "/Users/krishnaavva/Downloads/Happy-Smiley.jpg", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkEmail']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkChat']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkAccept']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_btnSubmit']", " ", driver, "click");
			genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_dvsuccess", "To complete your registration, please verify your email and accept the link sent.", driver, "successMessageID");
	        driver.quit();   


}
}
