package obsolete;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.genericFunctions;
public class HomePageValidations {
   
   @Test
   public void homePage() throws Exception {
   
       //Validating all the links in the LJS Home Page

	   WebDriver driver = genericFunctions.login();
	   
       //Validating Home Button		
       WebElement homeButton = driver.findElement(By.xpath(".//*[@id='form1']/div[3]/div/a/img"));
       Assert.assertEquals(true, homeButton.isDisplayed());
       System.out.println("LJS Image is present!!");

       //Validating Sign In and its options
       WebElement strSignIn = driver.findElement(By.xpath(".//*[@id='lnkLogin']"));
       WebElement strSignInJobSeeker = driver.findElement(By.xpath(".//*[@id='lblJsLogin']"));
       WebElement strSignInRecruiter = driver.findElement(By.xpath(".//*[@id='lblRecruiterLogin']"));
       WebElement strSignInEmployeeReferal = driver.findElement(By.xpath(".//*[@id='lblEmployeeReg']"));
       Assert.assertEquals(true, strSignIn.isEnabled());
       Assert.assertEquals (true,strSignInJobSeeker.isEnabled());
       Assert.assertEquals (true,strSignInRecruiter.isEnabled());
       Assert.assertEquals (true,strSignInEmployeeReferal.isEnabled());
       System.out.println("Sign In Functionalities are present!!");

       //Validating Register Options
       WebElement strRegister = driver.findElement(By.xpath(".//*[@id='lnkRegistration']"));
       WebElement strRegisterJobSeeker = driver.findElement(By.xpath(".//*[@id='lblJsRegister']"));
       WebElement strRegisterEmployer = driver.findElement(By.xpath(".//*[@id='lblRecruiterReg']"));
       WebElement strRegisterEmpoyeeReferal = driver.findElement(By.xpath(".//*[@id='lblEmployeeReg']"));
       Assert.assertEquals(true, strRegister.isEnabled());
       Assert.assertEquals (true,strRegisterJobSeeker.isEnabled());
       Assert.assertEquals (true,strRegisterEmployer.isEnabled());
       Assert.assertEquals (true,strRegisterEmpoyeeReferal.isEnabled());
       System.out.println("Registration Functionalities are present!!");

       //Validating Search functionalities    
       WebElement strJobsButton = driver.findElement(By.xpath(".//*[@id='btnFndJob']"));
       WebElement strResumesButton = driver.findElement(By.xpath(".//*[@id='btnFndResume']"));
       WebElement strShareAReferal = driver.findElement(By.xpath(".//*[@id='btnReferral']"));
       WebElement strPostAJob = driver.findElement(By.xpath(".//*[@id='btnPostJob']"));
       WebElement strUploadAResume = driver.findElement(By.xpath(".//*[@id='btnPostResume']"));
       WebElement strSearchBox = driver.findElement(By.xpath(".//*[@id='txtkeyword']"));
       WebElement strIndustryType = driver.findElement(By.xpath(".//*[@id='ddlFArea']"));
       Assert.assertEquals(true, strJobsButton.isEnabled());
       Assert.assertEquals(true, strResumesButton.isEnabled());
       Assert.assertEquals(true, strShareAReferal.isEnabled());
       Assert.assertEquals(true, strPostAJob.isEnabled());
       Assert.assertEquals(true, strUploadAResume.isEnabled());
       Assert.assertEquals (true,strSearchBox.isEnabled());
       Assert.assertEquals (true,strIndustryType.isEnabled());
       System.out.println("Search Functionalities are present!!");

       driver.quit();

   }

}