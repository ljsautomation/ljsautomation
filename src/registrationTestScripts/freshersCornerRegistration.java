package registrationTestScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLibrary.genericFunctions;


public class freshersCornerRegistration {

	    @Test
	    public void freshersCornerReg() throws Exception {
	    	WebDriver driver = genericFunctions.login();

	    	//Validating Recruiter/Employer Registration Process	
			genericFunctions.handleWebElements(".//*[@id='form1']/div[4]/div/div/ul[1]/li[4]/a", " ", driver, "click");
			
			genericFunctions.handleWebElements(".//*[@id='lnkRegistration']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='lblfsRegister']", " ", driver, "click");
			genericFunctions.handleWebElements("content-header-title", "Freshers Corner - Registration Form", driver, "successMessageClassName");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtfirstname']", "Krishna", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtlastname']", "Avva", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtemail']", "ljs02@gmail.com", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtmobile']", "2347778901", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtpwd']", "Local123", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtconfirmpwd']", "Local123", driver, "sendKeys");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtFresherLocation']", "Hyderabad", driver, "sendKeys");
		    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_rbtLstGender_0']")).sendKeys(Keys.SPACE);
		    genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_ddlEducation", "B.A.", driver, "list");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtCollegeName']", "SASTRA", driver, "sendKeys");
		    genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_ddlyop", "1985", driver, "list");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_txtkeywords']", "Java, Selenium", driver, "sendKeys");
		    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_flUpdResume']")).sendKeys("/Users/krishnaavva/Documents/workspace/SampleResume.docx");
		    driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_flUpdPhoto']")).sendKeys("/Users/krishnaavva/Downloads/Happy-Smiley.jpg");
		    genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkEmail']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkChat']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkAccept']", " ", driver, "click");
			genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_btnSubmit']", " ", driver, "click");
			genericFunctions.handleWebElements("ctl00_ContentPlaceHolder2_dvsuccess", "To complete your registration, please verify your email and accept the link sent.", driver, "successMessageID");
	        driver.quit();   


}
}

