package Selenium_1class;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_1 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");

        WebDriver d = new ChromeDriver();
        
        
        				d.get("https://demo.automationtesting.in/Frames.html");

        				
        				
        				
	       		WebElement singleframe = d.findElement(By.id("singleframe"));
           
                        d.switchTo().frame(singleframe);
           
                WebElement text = d.findElement(By.xpath("//input[@type=\"text\"]"));
                text.sendKeys("Hi shareeb");
       
          
                    Thread.sleep(5000);
              
                 	System.out.println("single frame done");
          
                     	d.switchTo().defaultContent();
          
                       System.out.println("returning to previous frame");
          	
             	WebElement frameinframe = d.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
            	frameinframe.click();
          	
          	
             	WebElement nestedframe = d.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
          		d.switchTo().frame(nestedframe);
          		
          		
          		WebElement iframedemo = d.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
          		d.switchTo().frame(iframedemo);
          		
          		
          		Thread.sleep(5000);
          		
                System.out.println("frame in frame done");
          		
          		WebElement text2 = d.findElement(By.xpath("//input[@type=\"text\"]"));
          		text2.sendKeys("frame in frame done");
          		
          		          System.out.println("BOTH FRAMES DONE");
          		
          		
          		
          		
          		
          	
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
    
      
      
      
      
      
      
      
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	
	
	
	
	
}
