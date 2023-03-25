package Selenium_1class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dynamic_xpath {

	
	
	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();	
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.get("https://www.myntra.com/");
				
		Actions a = new Actions(d);
		
		WebElement mens = d.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		a.moveToElement(mens).build().perform();
		
		a.clickAndHold(mens).perform();
		
		WebElement tshirt = d.findElement(By.xpath("//span[text()='Men T-shirts']"));
		
		a.moveToElement(tshirt).build().perform();
		
		a.click(tshirt).perform();
		
		WebElement hrx = d.findElement(By.xpath("(//span[@class='product-strike'])[3]//preceding::span[@class='product-discountedPrice'][1]"));
		
		a.contextClick(hrx).build().perform();
		
		System.out.println("DONE...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
