package Selenium_1class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");
		
			WebDriver d = new ChromeDriver();
			
			
		//	d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			
			/*d.get("https://www.amazon.in/");
			
			JavascriptExecutor js = (JavascriptExecutor) d;
			
		    js.executeScript("window.scrollBy(0,2000)");
		
			
			System.out.println("SCROLL TO 2000 PIXELS");
			
			
			WebElement instagram = d.findElement(By.xpath("//a[text()='Instagram']"));
			
			js.executeScript("arguments[0].scrollIntoView();",instagram);
			
			System.out.println("scroll to find instagram "); 
			
			
			
			
			WebElement amazonscience = d.findElement(By.xpath("//a[text()='Amazon Science']"));
			
			js.executeScript("arguments[0].scrollIntoView();",amazonscience);
			
			System.out.println("SCROLL TO AMAZON SCIENCE");*/
			
			
			d.get("https://www.flipkart.com/");	
			
			JavascriptExecutor js = (JavascriptExecutor) d;

			WebElement close = d.findElement(By.xpath("//button[text()='✕']"));
			
			System.out.println("closing by clicking X");
			
			js.executeScript("arguments[0].click();",close);
			
			
			js.executeScript("window.scrollBy(0,1000)");
			
			System.out.println("sccrolling");
			
			WebElement stories = d.findElement(By.xpath("//a[text()='Flipkart Stories']"));
			
			System.out.println("moving to flipkart stories");
			
			js.executeScript("arguments[0].scrollIntoView();",stories);
			
			js.executeScript("arguments[0].click();",stories);

			System.out.println("again scrolling down");
			
			js.executeScript("window.scrollBy(0,6000)");

			WebElement website = d.findElement(By.xpath("//a[text()='FLIPKART.COM']"));
			
			System.out.println("now click on flipkart");
			
			js.executeScript("arguments[0].scrollIntoView();",website);
			
			js.executeScript("arguments[0].click();",website);

			js.executeScript("window.scrollBy(0,1000)");
			
			System.out.println("All DONE");
			
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
