package miscValidations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

import genericLibrary.genericFunctions;
public class HomePageValidations {
   
   @Test
   public void homePage() throws Exception {
   
       //Validating all the links in the LJS Home Page

	   WebDriver driver = genericFunctions.login();
       
       //Validating Industry Types

        
	   List<String> industryList = new ArrayList<String>();
	   industryList.add("--Select Industry Type--");
	   industryList.add("Accounting/Finance");
	   industryList.add("Admin/ secretory");
	   industryList.add("Analytics/ Business Intelligence");
	   industryList.add("Banking");
	   industryList.add("Call Centre/ Customer Service/ITEs/BPO");
	   industryList.add("Construction/ Production/ Manufacturing");
	   industryList.add("Courier/Freight/Transpotation");
	   industryList.add("Hotels/ Restaurants");
	   industryList.add("Human Resource,Recruitment");
	   industryList.add("Insurance");
	   industryList.add("IT Software/IT Hardware");
	   industryList.add("Legal/ Law");
	   industryList.add("Marketing & Communications");
	   industryList.add("Media/ Entertainment");
	   industryList.add("Medical/ HealthCare/Hospitals");
	   industryList.add("Oil & Gas");
	   industryList.add("Others");
	   industryList.add("Pharmaceutical/Bio Technology& Life Sciences");
	   industryList.add("Production/ Engg/ R&D");
	   industryList.add("Purchase/ Supply Chain");
	   industryList.add("Retailing");
	   industryList.add("Sales/ Sales Persons");
	   industryList.add("Telecommunication");
	   industryList.add("Advertising/Event Management");
	   industryList.add("Education/ Teaching");
	   industryList.add("Export/ Import");
	   industryList.add("Travels");
	
       genericFunctions.listComparator(driver, ".//*[@id='ddlFArea']",industryList);
       
       driver.quit();

   }

}