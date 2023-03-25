package Selenium_1class;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.seleniumhq.jetty9.util.Scanner;
public class project {
	
	public static void main(String[] args) throws InterruptedException {
		
		       System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
				WebDriver d = new ChromeDriver();
				Actions a = new Actions(d);
				
				d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				d.get("https://www.nykaa.com/");
				
				d.manage().window().maximize();
			 
				WebElement sign1 = d.findElement(By.xpath("//button[text()='Sign in']"));
			  sign1.click();
			  
			  WebElement sign2 = d.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']")); 
			  sign2.click();
			  
			  WebElement enter = d.findElement(By.xpath("//input[@name='emailMobile']"));
			  enter.sendKeys("8610765217");
			  Thread.sleep(1000);
			  
			  WebElement proceed = d.findElement(By.xpath("//button[text()='proceed']"));
			  proceed.click();
			  System.out.println("otp");
			  
			  WebElement OTP = d.findElement(By.xpath("//input[@type=\"number\"]"));
			  
			   java.util.Scanner s = new java.util.Scanner(System.in);
		    	String number=s.next(); 
			  OTP.sendKeys(number);
			  
			  System.out.println("sent OTP");
			  
			  WebElement verify = d.findElement(By.xpath("//button[@type=\"submit\"]"));
			  verify.click();
			  
			  System.out.println("verification done...");
			 
			  WebElement pop = d.findElement(By.xpath("//a[text()=\"Pop Ups\"]"));
			  a.moveToElement(pop).perform();
			  
			  WebElement sm = d.findElement(By.xpath("//a[text()=\"Smart Watches & Activity Trackers\"]"));
			  a.moveToElement(sm).perform();
			  a.click(sm).perform();
			 
			  Set<String>WindowHandles = d.getWindowHandles();
			  System.out.println(WindowHandles);
			  for(String W : WindowHandles ) {
					  String title=d.switchTo().window(W).getTitle();
					  System.out.println(title);
			  }
			  Thread.sleep(1000);
			  JavascriptExecutor js = (JavascriptExecutor)d;
			  js.executeScript("window.scrollBy(0,1000)");
			  Thread.sleep(1000);
			  WebElement sm1 = d.findElement(By.xpath("//img[@alt=\"PunnkFunnk D115 Smart Band with Activity Tracking & Health Monitoring\"]"));
			  sm1.click();
			  Set<String>WindowHandles1 = d.getWindowHandles();
			  System.out.println(WindowHandles1);
			  for(String W1 : WindowHandles1 ) {
					  String title1=d.switchTo().window(W1).getTitle();
					  System.out.println(title1);
			  }
			  Thread.sleep(1000);
			  WebElement add = d.findElement(By.xpath("(//button[@class=\" css-12z4fj0\"])[1]"));
			  a.moveToElement(add).perform();
			  a.click().perform();
			  
			  WebElement bag = d.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
			  a.moveToElement(bag).perform();
			  a.click(bag).perform();
			  
			  WebElement cart = d.findElement(By.xpath("//iframe[@src=\"/mobileCartIframe?ptype=customIframeCart\"]"));
			  d.switchTo().frame(cart);
			  
			  WebElement proceeed = d.findElement(By.xpath("//span[text()=\"Proceed\"]"));
			  a.moveToElement(proceeed).perform();
			  a.click(proceeed).perform();
			  
			  System.out.println("proceed done");
//*			  
			  WebElement add_address = d.findElement(By.xpath("//div[@class=\"css-lw67gk e1gecm6x1\"]"));
			  a.moveToElement(add_address).build().perform();
			  a.click(add_address).perform();
			
	
				WebElement pincode = d.findElement(By.xpath("(//input[@type=\"number\"])[1]"));
				pincode.sendKeys("635802");
				
				Thread.sleep(10000);
//*		
				WebElement state = d.findElement(By.xpath("//textarea[@placeholder=\"Road Name/ Area /Colony\"]"));
			    state.sendKeys("TAMILNADU");
	
//*			    
				WebElement areaname = d.findElement(By.xpath("//textarea[@class=\"input-element input-area \"]"));
				areaname.sendKeys("sipcot industrial estate");
				
				System.out.println("address filled ");
				
	
				WebElement name = d.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
				name.sendKeys("MICHAEL");
				
				WebElement phonenumber = d.findElement(By.xpath("(//input[@type=\"number\"])[2]"));
				phonenumber.sendKeys("8610765217");
				
				WebElement houseno = d.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
				a.click().build().perform();
				houseno.sendKeys("4/452");
				
				Thread.sleep(3000);
				
				WebElement shiptoaddress = d.findElement(By.xpath("//button[text()='Ship to this address']"));
				a.moveToElement(shiptoaddress).build().perform();
				a.click(shiptoaddress).perform();
				
				Thread.sleep(5000);
				
				
			    WebElement cashonDelivery = d.findElement(By.xpath("//p[text()='Cash on delivery']"));
				cashonDelivery.click();
				
	            WebElement placeorder = d.findElement(By.xpath("//button[text()='Place order']"));
				placeorder.click();
				
				System.out.println("contact id DONE...");
			  
			  
			  
			  
			  
			  
			  
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
