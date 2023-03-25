package Selenium_1class;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.WindowConstants;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Nykaa_project{
	 
	 
	 public static void main(String[]args) throws InterruptedException, IOException {
		 
		 

			System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			
			Actions a = new Actions(driver);
		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.get("https://www.nykaa.com/");

			driver.manage().window().maximize();

//SIGNUP PROCESS

			WebElement signup = driver.findElement(By.xpath("//button[text()='Sign in']"));
			signup.click();

			WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
			signin.click();

			WebElement register = driver.findElement(By.xpath("//input[@name='emailMobile']"));
			register.sendKeys("8610765217");

			Thread.sleep(2000);

			WebElement proceed = driver.findElement(By.xpath("//button[text()='proceed']"));
			proceed.click();

			System.out.println("sending otp");

			WebElement OTP = driver.findElement(By.xpath("//input[@type=\"number\"]"));
			Scanner s = new Scanner(System.in);
			String number = s.next();
			OTP.sendKeys(number);

			WebElement verify = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			verify.click();

			System.out.println("OTP DONE...");

//FINDING ELEMENTS
			
			WebElement popups = driver.findElement(By.xpath("//a[text()='Pop Ups']"));
			a.moveToElement(popups).build().perform();

			System.out.println("DONE...");

			WebElement headset = driver.findElement(By.xpath("//a[text()='Headphones  ']"));
			a.moveToElement(headset).build().perform();
			a.click(headset).perform();

			System.out.println("DONE...");

			Set<String> windowHandles1 = driver.getWindowHandles();
			System.out.println(windowHandles1);

			for (String windows1 : windowHandles1) {
				String title3 = driver.switchTo().window(windows1).getTitle();
				System.out.println("Navigate to Window" + "  " + title3);
			}

			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");

			Thread.sleep(500);
			WebElement boult = driver.findElement(By.xpath("//img[@alt=\"Boult Audio AirBass GearPods -Black\"]"));
			boult.click();

			System.out.println("DONE....");
			
			Set<String> windowHandles2 = driver.getWindowHandles();

			for (String windows2 : windowHandles2) {
				String title2 = driver.switchTo().window(windows2).getTitle();
				System.out.println("Navigate to Window" + "  " + title2);
			}

				Thread.sleep(1000);
			WebElement add2bag = driver.findElement(By.xpath("(//button[@class=' css-12z4fj0'])[1]"));
				a.moveToElement(add2bag).build().perform();
				a.click().build().perform();
			
			
//bag process
			WebElement bag = driver.findElement(By.xpath("(//button[@type=\"button\"])[2]"));
			a.moveToElement(bag).build().perform();
			a.click(bag).perform();
			
			WebElement cartframe = driver.findElement(By.xpath("//iframe[@src=\"/mobileCartIframe?ptype=customIframeCart\"]"));
			driver.switchTo().frame(cartframe);
			
			WebElement proceed1 = driver.findElement(By.xpath("//span[text()='Proceed']"));
			a.moveToElement(proceed1).build().perform();
			a.click(proceed1).perform();
			
			
			WebElement addemail = driver.findElement(By.xpath("//p[text()='Add New Address']"));
			addemail.click();
		   
			
//ADDRESS BAR
			WebElement pincode = driver.findElement(By.xpath("(//input[@type=\"number\"])[1]"));
			pincode.sendKeys("635802");
			
			Thread.sleep(10000);
			
			WebElement state = driver.findElement(By.xpath("//textarea[@placeholder=\"Road Name/ Area /Colony\"]"));
		    state.sendKeys("TAMILNADU");
			
			WebElement areaname = driver.findElement(By.xpath("//textarea[@class=\"input-element input-area \"]"));
			areaname.sendKeys("MUHAMMEDPURA/OPPOSITE/STREET");
			
			System.out.println("address filled ");
			
//CONTACT
			WebElement name = driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
			name.sendKeys("md shareeb");
			
			WebElement phonenumber = driver.findElement(By.xpath("(//input[@type=\"number\"])[2]"));
			phonenumber.sendKeys("8610765217");
			
			WebElement houseno = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
			a.click().build().perform();
			houseno.sendKeys("Number/17");
			
			Thread.sleep(3000);
			
			WebElement shiptoaddress = driver.findElement(By.xpath("//button[text()='Ship to this address']"));
			a.moveToElement(shiptoaddress).build().perform();
			a.click(shiptoaddress).perform();
			
			Thread.sleep(5000);
			
//PAYMENT PROCESS			
		    WebElement cashonDelivery = driver.findElement(By.xpath("//p[text()='Cash on delivery']"));
			cashonDelivery.click();
			
            WebElement placeorder = driver.findElement(By.xpath("//button[text()='Place order']"));
			placeorder.click();
			
			System.out.println("contact id DONE...");
			
			
			        Thread.sleep(20000);
			 
//screenshot              
             TakesScreenshot ts1 = (TakesScreenshot) driver ;
		     	 
		     	 File screenshotAs = ts1.getScreenshotAs(OutputType.FILE);
		     	 
		     	 File dest1 = new File("C:\\Selenium_1\\screenshots\\nykaaUrl.png");
		     	 
		     	 FileUtils.copyFile(screenshotAs,dest1);
		     	 
		     	 System.out.println("captured");
			
			System.out.println("MINI PROJECT done");
			
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

