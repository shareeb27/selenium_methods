package Selenium_1class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_cls {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");

            WebDriver d = new ChromeDriver();
            
            
            d.get("https://letcode.in/alert");
           WebElement simple = d.findElement(By.xpath("//button[text() = 'Simple Alert']"));
            simple.click();
            
            d.switchTo().alert().accept();
          
       
            WebElement confirm = d.findElement(By.xpath("//button[text() = 'Confirm Alert']")); 
            confirm.click();
            d.switchTo().alert().dismiss();
            
           
            WebElement prompt = d.findElement(By.xpath("//button[text() ='Prompt Alert']"));
            prompt.click();
          
            d.switchTo().alert().sendKeys("shareeb");
            
            d.switchTo().alert().accept();
            
            System.out.println("DONE");
            
            
            
            
            
            
            
              
            
            
            
          
          
          
          
			
	
	}
	
	
}
