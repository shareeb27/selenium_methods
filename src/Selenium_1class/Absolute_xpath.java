package Selenium_1class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Absolute_xpath {

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		Actions a = new Actions(d);
		
		WebElement acc_list = d.findElement(By.xpath("/html[1]/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span"));
		
		a.moveToElement(acc_list).build().perform();
		
		System.out.println("moving to Acc & list");
		
		a.clickAndHold(acc_list).perform();
		
   	   WebElement signin = d.findElement(By.xpath("/html[1]/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[1]/div/a/span"));	
		
		a.moveToElement(signin);
		
		System.out.println("moving to signin page");

		a.click().perform();
		
		WebElement email = d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div/input"));
		
		System.out.println("inserting name");
		
		a.click(email).sendKeys("shareeb").perform();
		
		System.out.println("DONE USING ABSOLUTE X-PATH");
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
