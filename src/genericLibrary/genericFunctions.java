package genericLibrary;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class genericFunctions {
	
	//Creates WebDriver instance and launches the browser
	
	//Testing Git Hub
	
	public static WebDriver login() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.localjobserver.com/home.aspx");
		return driver;
	}
	
	//Handles generic operations on web elements
public static void handleWebElements (String elementID, String value, WebDriver driver, String action) {
	if (action == "sendKeys") {
		driver.findElement(By.xpath(elementID)).sendKeys(value);
	}
	else if (action == "click"){
		driver.findElement(By.xpath(elementID)).click();	
	}
	else if (action == "list") {
	     Select lstSelect = new Select(driver.findElement(By.id(elementID)));
	        lstSelect.selectByVisibleText(value);
	}
	else if (action == "successMessageID") {
		String strConfirmMessageID = driver.findElement(By.id(elementID)).getText();
	       Assert.assertEquals(value, strConfirmMessageID);
	}
	else if (action == "successMesssageClassName") {
		String strConfirmMessageClassName = driver.findElement(By.className(elementID)).getText();
	       Assert.assertEquals(value, strConfirmMessageClassName);
	}
	else if (action == "isEnabled") {
		WebElement strIsEnabled = driver.findElement(By.xpath(elementID));
	       Assert.assertEquals(true, strIsEnabled.isEnabled());
	}
	else if (action  == "isDisabled"){
		WebElement strIsDisabled = driver.findElement(By.xpath(elementID));
	       Assert.assertEquals(true, strIsDisabled.isEnabled());
	}
	else if (action == "validateList"){
	}
}

//Validates the HTTP Response. 

    public static void brokenLinkValidations (WebDriver driver, String currentURL) {
    driver.navigate().to(currentURL);
    int httpLinks = 0;
    
	List <WebElement>linksList = driver.findElements(By.tagName("a")); // finds link elements & stores in a list 
	//traverse each link from collection 
	for(WebElement linkElement: linksList){ 
	String link =linkElement.getAttribute("href"); 
	System.out.println("********" + link);
	if(link!=null){ 
		if (link.startsWith("http://")) {
			verifyLinkActive(link); 
			httpLinks++;
		}
	} 
	} 
	System.out.println("### Total Http Links tested : " + httpLinks);
	}

	public static void verifyLinkActive(String linkUrl){ 
	try { 
	URL url = new URL(linkUrl); 
	HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection(); 
	httpURLConnect.setConnectTimeout(3000); 
	httpURLConnect.connect(); 
	if(httpURLConnect.getResponseCode()==200){ 
	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()); 
	} 
	if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) 
	{ 
	System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND); 
	}  
	else {
		System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - " + httpURLConnect.getResponseCode()); 
	}
	}
	catch (MalformedURLException e) { 
	e.printStackTrace(); 
	} catch (IOException e) { 
	e.printStackTrace(); 
	} catch (Exception e) { 
	e.printStackTrace(); 
	} 
	}
	
	//List Comparator for a any given list. 

	public static void listComparator(WebDriver driver, String listID, List<String> ListToTest ) {
		
		Select select = new Select(driver.findElement(By.xpath(listID)));
		Set<String> industryValuesFound = new TreeSet<String>();
		Set<String> industryValuesNotFound = new TreeSet<String>(); 
		List<WebElement> webElements = select.getOptions();
		
		for(WebElement element: webElements)  
	    {
	        String var2 = element.getText();
	        if(ListToTest!=null && ListToTest.size()>0){
	        	if(!ListToTest.contains(var2)){
	        		industryValuesNotFound.add(var2);
	        	}else{
	        		industryValuesFound.add(var2);
	        	}
	        }
	    }
		System.out.println("-----Elements Found in the industry List-----"+industryValuesFound);
		System.out.println("-----Elements Not Found in the industry List-----"+industryValuesNotFound);
		
	}
	
	
}


