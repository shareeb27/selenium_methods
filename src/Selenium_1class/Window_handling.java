package Selenium_1class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_handling {

	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();	
		
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.get("https://www.amazon.in/");
		
		Actions as = new Actions(d);
		Robot r = new Robot();
		
		WebElement best_sellers = d.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		as.moveToElement(best_sellers).build().perform();
		
		//System.out.println("moving to best seller");
		
		as.contextClick(best_sellers).build().perform();
		
	  //   System.out.println("right click on it");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		//System.out.println("click to down");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//System.out.println("pressing enter");
		
		System.out.println("now opening to new page");

		WebElement mobiles = d.findElement(By.xpath("//a[text()='Mobiles']"));
		
      as.moveToElement(mobiles).build().perform();
		
		//System.out.println("moving to mobiles");
		
		as.contextClick(mobiles).build().perform();
		
	  //   System.out.println("right click on it");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		System.out.println("click to down");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	//	System.out.println("pressing enter");
		
		System.out.println("now opening to new page");
		
		
		WebElement deals = d.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));

        as.moveToElement(deals).build().perform();

		//System.out.println("moving to today deals");
		
		as.contextClick(deals).build().perform();
		
	  //   System.out.println("right click on it");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	//	System.out.println("click to down");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	//	System.out.println("pressing enter");
		
		System.out.println("now opening to new page");
		
//===============================================================================
	
		//this is window handle 
		String windowhandle = d.getWindowHandle();
		 
		System.out.println(windowhandle);
		
		//this is window handles
		Set<String> windowHandles = d.getWindowHandles();
		 
		System.out.println(windowhandle);
		
		
		//to handle window use 'FOR' keyword
		
		 for(String window :windowHandles){

			 	String title = d.switchTo().window(window).getTitle();
			System.out.println(title); 	
		 }
		
		
 String s = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n";
 
 for(String w : windowHandles) {
	 
	 if(d.switchTo().window(w).getTitle().equals(s)) {
		 
		break;
	 }
	 
	 
 }

 System.out.println("DONE....");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
