package registrationTestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import genericLibrary.genericFunctions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


	public class jobSeekerRegistrations {
		
			    @Test
			    public void jobSeekerReg() throws Exception {
			    	WebDriver driver = genericFunctions.login();

			        //Validating Job Seeker Registration ProcessRegister Options		        
			        driver.findElement(By.xpath(".//*[@id='lnkRegistration']")).click();
			        driver.findElement(By.xpath(".//*[@id='lblJsRegister']")).click();
			        String strConfirmJobSeekerRegistration = driver.findElement(By.className("content-header-title")).getText();
			        Assert.assertEquals("Job Seeker - Registration Form", strConfirmJobSeekerRegistration);
			        
			        genericFunctions.brokenLinkValidations(driver, driver.getCurrentUrl());
			        		        
			        //Entering the registration details:Personal Information
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtfirstname']")).sendKeys("Krishna");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtlastname']")).sendKeys("Avva");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtemail']")).sendKeys("abc@gmail.com");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtmobile']")).sendKeys("1234567890");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtpwd']")).sendKeys("Local123");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtconfirmpwd']")).sendKeys("Local123");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_rdoGender_0']")).sendKeys(Keys.SPACE);
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtlanguagesKnown']")).sendKeys("English, Hindi, telugu");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_btnProfessional']")).click();
			        
			        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.SECONDS);
			        
			        //Entering the registration details:Professional Details
			       
			        Select lstCurrentIndustry = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlIndustry")));
			        lstCurrentIndustry.selectByVisibleText("IT Software/IT Hardware");
			        
			        driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.SECONDS);
			        
			       Select lstRole = new Select (driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_ddlrole']")));
			        lstRole.selectByVisibleText("Analyst Programer");
			        
			        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			        
			        Select lstJobType = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlJobType")));
			        lstJobType.selectByVisibleText("Any");
			        
			        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			        
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtCurrentDesignation']")).sendKeys("Senior Consultant");
			        
			        Select lstTotalExp = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlExp")));
			        lstTotalExp.selectByVisibleText("10");
			        
			        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			        
			        Select lstCurrentCTC = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlLakhs")));
			        lstCurrentCTC.selectByVisibleText("10");
			        
			        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			        
			        Select lstExpectedCTC = new Select (driver.findElement(By.id(".//*[@id='ctl00_ContentPlaceHolder2_ddlExpectedCTC']")));
			        lstExpectedCTC.selectByVisibleText("15");
			    
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtkeywords']")).sendKeys("Java");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtresumeheadline']")).sendKeys("Senior Consultant");
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtCurrentCompany']")).sendKeys("Local Job Server");
			        
			        Select lstCurrLocation = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlocation']")));
			        lstCurrLocation.selectByVisibleText("Hyderabad");
			        
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_txtPreferedLocation']")).sendKeys("Chennai");
			        
			        Select lstNoticePeriod = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlNoticePeriod")));
			        lstNoticePeriod.selectByVisibleText("15 Days");
			        
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_btnEducation']")).click();
			        
			        //Entering the registration details: Education Details
			        

			        Select education = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlEducation")));
			        education.selectByVisibleText("BBA");
			        
			        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			        
			        Select institute = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlinstitute")));
			        institute.selectByVisibleText("AIMA");
			        
			        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			        
			        Select yearofpassing = new Select (driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlyop")));
			        yearofpassing.selectByVisibleText("1985");
			        
			        driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder2_flupdLogo']")).sendKeys("/Users/krishnaavva/Downloads/Happy-Smiley.jpg");
			        
			        genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkEmail']", " ", driver, "click");
					genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_chkChat']", " ", driver, "click");
					genericFunctions.handleWebElements(".//*[@id='chkAccept']", " ", driver, "click");
					genericFunctions.handleWebElements(".//*[@id='ctl00_ContentPlaceHolder2_btnSubmit']", " ", driver, "click");
			        
			       
			        
			       
			        
			        
			    }
			   
			}