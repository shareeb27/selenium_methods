package Selenium_1class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_method {

	
	public static void main(String[] args) throws AWTException {
		
 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");
		 
		 WebDriver d = new ChromeDriver();
		 
		 d.get("https://www.facebook.com/login/");
		 
WebElement email = d.findElement(By.id("email"));	
		
  Actions a = new Actions(d);
  
  	a.moveToElement(email).build().perform();
  	
  	Robot r = new Robot();
  
  r.keyPress(KeyEvent.VK_S);
  r.keyRelease(KeyEvent.VK_S);
  
  r.keyPress(KeyEvent.VK_H);
  r.keyRelease(KeyEvent.VK_H);
  
  r.keyPress(KeyEvent.VK_A);
  r.keyRelease(KeyEvent.VK_A);
  
  r.keyPress(KeyEvent.VK_R);
  r.keyRelease(KeyEvent.VK_R);
  
  r.keyPress(KeyEvent.VK_E);
  r.keyRelease(KeyEvent.VK_E);
  
  r.keyPress(KeyEvent.VK_E);
  r.keyRelease(KeyEvent.VK_E);
  
  r.keyPress(KeyEvent.VK_B);
  r.keyRelease(KeyEvent.VK_B);
  
  r.keyPress(KeyEvent.VK_2);
  r.keyRelease(KeyEvent.VK_2);
  
  r.keyPress(KeyEvent.VK_7);
  r.keyRelease(KeyEvent.VK_7);
  
  
  System.out.println("INSERTING USERNAME DONE");
  
  
  WebElement password = d.findElement(By.xpath("//input[@autocomplete=\"current-password\"]"));
  
  Actions a1 = new Actions(d);
  
  a1.moveToElement(password).build().perform();
  a1.click().perform();
  
  
  r.keyPress(KeyEvent.VK_M);
  r.keyRelease(KeyEvent.VK_M);
  
  r.keyPress(KeyEvent.VK_O);
  r.keyRelease(KeyEvent.VK_O);
  
  r.keyPress(KeyEvent.VK_R);
  r.keyRelease(KeyEvent.VK_R);
  
  r.keyPress(KeyEvent.VK_N);
  r.keyRelease(KeyEvent.VK_N);
  
  r.keyPress(KeyEvent.VK_I);
  r.keyRelease(KeyEvent.VK_I);
  
  r.keyPress(KeyEvent.VK_N);
  r.keyRelease(KeyEvent.VK_N);
  
  
  r.keyPress(KeyEvent.VK_G);
  r.keyRelease(KeyEvent.VK_G);
  
  r.keyPress(KeyEvent.VK_0);
  r.keyRelease(KeyEvent.VK_0);
  
  r.keyPress(KeyEvent.VK_3);
  r.keyRelease(KeyEvent.VK_3);
  
  System.out.println("INSERTING PASSWORD DONE");
		 
		 
		 d.get("https://www.instagram.com/accounts/login/");
		 
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 WebElement username = d.findElement(By.xpath("//input[@type=\"text\"]"));
		 
			
		  Actions a2 = new Actions(d);
		  
		  	a.moveToElement(username).build().perform();
		  	a.click().perform();
		  	
		  	Robot r1 = new Robot();
		  
		  r1.keyPress(KeyEvent.VK_I);
		  r1.keyRelease(KeyEvent.VK_I);
		  
		  r1.keyPress(KeyEvent.VK_T);
		  r1.keyRelease(KeyEvent.VK_T);
		  
		  r1.keyPress(KeyEvent.VK_Z);
		  r1.keyRelease(KeyEvent.VK_Z);
		  
		  r1.keyPress(KeyEvent.VK_SPACE);
		  r1.keyRelease(KeyEvent.VK_SPACE);
		    
		  r1.keyPress(KeyEvent.VK_M);
		  r1.keyRelease(KeyEvent.VK_M);
		  
		  r1.keyPress(KeyEvent.VK_E);
		  r1.keyRelease(KeyEvent.VK_E);
		  
		  r1.keyPress(KeyEvent.VK_SPACE);
		  r1.keyRelease(KeyEvent.VK_SPACE);
		  
		  r1.keyPress(KeyEvent.VK_S);
		  r1.keyRelease(KeyEvent.VK_S);
		  
		  r1.keyPress(KeyEvent.VK_H);
		  r1.keyRelease(KeyEvent.VK_H);
		  
		  r1.keyPress(KeyEvent.VK_A);
		  r1.keyRelease(KeyEvent.VK_A);
		  
		  r1.keyPress(KeyEvent.VK_R);
		  r1.keyRelease(KeyEvent.VK_R);
		  
		  r1.keyPress(KeyEvent.VK_E);
		  r1.keyRelease(KeyEvent.VK_E);
		  
		  r1.keyPress(KeyEvent.VK_E);
		  r1.keyRelease(KeyEvent.VK_E);
		  
		  
		  r1.keyPress(KeyEvent.VK_B);
		  r1.keyRelease(KeyEvent.VK_B);
		  
		  r1.keyPress(KeyEvent.VK_0);
		  r1.keyRelease(KeyEvent.VK_0);
  
		  r1.keyPress(KeyEvent.VK_3);
		  r1.keyRelease(KeyEvent.VK_3);
		  
		   
		  WebElement login = d.findElement(By.xpath("//div[text()='Log in']"));
		  
		  a.moveToElement(login).build().perform();
		  
		  a.click().perform();
		  
		  System.out.println("FINISHED");
		  
  

	}
	
	
	
	
}
