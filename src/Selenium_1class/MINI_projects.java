package Selenium_1class;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MINI_projects {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.get("https://www.nykaa.com/");
		
		Actions a = new Actions (driver);
		
		
		//SIGNUP PROCESS
		
	/*   WebElement signup = driver.findElement(By.xpath("//button[text()='Sign in']"));
		signup.click();
		 
		WebElement signin = driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
		signin.click();
		
		WebElement register = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		register.sendKeys("8610765217");
		
		WebElement proceed  = driver.findElement(By.xpath("//button[text()='proceed']"));
		proceed.click();
		
		System.out.println("sending otp");
		
		WebElement OTP = driver.findElement(By.xpath("//input[@type=\"number\"]"));
		Scanner s = new Scanner(System.in);
		String number = s.next();
		OTP.sendKeys(number);
		
		System.out.println("OTP SENDED ");
		
		WebElement verify = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		verify.click();
		
		System.out.println("OTP DONE...");*/

		
		
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
	
		
		WebElement categoreis = driver.findElement(By.xpath("//a[text()='categories']"));
		
		a.clickAndHold(categoreis).build().perform();
		
		//a.click(categoreis).perform();
		
		System.out.println("CATEGORY PAGE DONE...");
		
		WebElement makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
	
		a.clickAndHold(makeup).build().perform();
		
		a.click(makeup).perform();
		
		System.out.println("MAKEUP PAGE DONE...");

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//	
//		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
        WebElement lipliner = driver.findElement(By.xpath("//a[text()='Lip Liner']"));
      
        a.moveToElement(lipliner).build().perform();
        
        a.click(lipliner).perform();
        
        WebElement heading = driver.findElement(By.xpath("//h1[text()='All Products']"));
        heading.click();
        
     //   js.executeScript("window.scrollBy(0,2500)");
        
        System.out.println("scrolling done");
        
        System.out.println("LIPLINER PAGE DONE ");
        
      //  Thread.sleep(10000);
      //  driver.switchTo().alert().dismiss();

        WebElement brand = driver.findElement(By.xpath("//img[@alt=\"Nykaa Lips Don't Lie! Line & Fill Lip Liner\"]"));
        a.moveToElement(brand).build().perform(); 
        a.click(brand).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
