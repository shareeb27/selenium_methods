package Selenium_1class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webelement_method {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");

		
	         WebDriver d = new ChromeDriver();
		
	         
	     	 d.get("https://www.facebook.com/");
	     	 
	     	 
	     	 
	/*    WebElement login = d.findElement(By.xpath("//button[@type=\"submit\"]"));
	    
	    		boolean displayed = login.isDisplayed();
	    		System.out.println("is displayed :"+ displayed);
	            
	    		
	    		boolean enabled = login.isEnabled();
	    		System.out.println("is enabled :"+ enabled);
	    		
	    		
	    		boolean selected = login.isSelected();
	    		System.out.println("is selected :"+ selected);
	    		
	    		
	            String tagName = login.getTagName();
	            System.out.println("LOGIN tagName :"+ tagName);
	            
	            
	            String text = login.getText();
	            System.out.println("TEXT :"+ text);*/
	     	 
	     	 
	     	 
	     	 // SCREENSHOT METHOD  
	     	 
	     	 TakesScreenshot ts = (TakesScreenshot) d ;
	     	 
	     	 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	     	 
	     	 File dest = new File("C:\\Selenium_1\\screenshots\\facebookUrl.png");
	     	 
	     	 FileUtils.copyFile(screenshotAs,dest);
	     	  
	     
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	     	 
	            
	            
	            
	            
	           
	    

	}

}
