package Selenium_1class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
			
			
			driver.get("https://www.techlistic.com/");
		
			List<WebElement> alldata = driver.findElements(By.xpath("//table[1]/tbody/tr/td "));
		    
		      
			for(WebElement all : alldata ) {
				System.out.println(all.getText());
			}

			
			
		
		
		
		
		
		
	}

}
