package Selenium_1class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_1 {
	
	public static void main(String[] args) {
		
		

		 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		
		
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 driver.navigate().to("https://www.amazon.in/");
		 
		 System.out.println("opening");
		 
		 WebElement mobiles = driver.findElement(By.xpath("//a[text() ='Mobiles']"));
		
		 
		 //MOUSE ACTIONS 
		 
		 
		 Actions as = new Actions(driver);
		 
		 as.moveToElement(mobiles).build().perform();
		 
		 System.out.println("wait");
		 
		 as.clickAndHold(mobiles).build().perform();
		 
		 as.click().perform();
		 
		 System.out.println("DONE");
		 
		
		driver.get("https://www.flipkart.com/");
		 
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='✕']"));
		button.click();
		
		System.out.println("done");
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
	    System.out.println("done");
	    
	    
	
		Actions as1 = new Actions(driver);
		
		as1.clickAndHold(fashion).build().perform();
		 
		System.out.println("DONE");		
	    
		WebElement menswear = driver.findElement(By.xpath("//a[text()=\"Men's Bottom Wear\"]"));
        
		System.out.println("DONE");
		
	    as1.clickAndHold(menswear).build().perform();
	    
	    WebElement mensjeans = driver.findElement(By.xpath("//a[text()=\"Men's Jeans\"]"));
	    
	    System.out.println("DONE");
	    
	    as1.click(mensjeans).build().perform();

	    
	  
	    
	    
	    
		System.out.println("All done");

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
