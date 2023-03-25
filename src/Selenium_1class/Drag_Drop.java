package Selenium_1class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	
	
	public static void main(String[] args) {
		
	
	
 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		 
		 WebDriver d = new ChromeDriver();
		
		
		 d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		 
		 
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		
		WebElement frame = d.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		 
		d.switchTo().frame(frame);
		
		WebElement drag = d.findElement(By.xpath("//h5[text()='High Tatras']"));
		 
		
		WebElement drop = d.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions a = new Actions(d);
		
		//a.dragAndDrop(drag, drop).build().perform();
		a.moveToElement(drag).build().perform();
		a.clickAndHold(drag).perform();
		a.release(drop).perform();
		
		System.out.println("ALL DONE");
		
		
		
		
		
		
		

	}
}
