package Selenium_1class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) {
		
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
			
			driver.get("https://letcode.in/dropdowns");
			
//	WebElement single = driver.findElement(By.id("fruits"));
			
			
			//SINGLE DROPDOWN
			
		/*	Select s = new Select(single);
			
			s.selectByVisibleText("Apple");
			s.selectByValue("2");
			s.selectByIndex(4);
			
			
			System.out.println("done...");*/
			
			
			//MULTIPLE DROPDOWN
			
	WebElement multiple = driver.findElement(By.id("superheros"));
			
			Select mul =  new Select(multiple);
			
			
			if(mul.isMultiple()) {
				
				mul.selectByValue("dd");
				mul.selectByVisibleText("Doctor Strange");
				
				System.out.println("captian is DONE..");
				
			}

			List<WebElement> all = mul.getOptions();
	
					for(WebElement web : all) {
						
						System.out.println(web.getText());
					}
			
					
					List<WebElement> allSelectedOptions = mul.getAllSelectedOptions();
					
					for(WebElement every : allSelectedOptions) {
						 
						System.out.println(every.getText());
						
						System.out.println("=====================frst options==============");
					}
			
			
				WebElement firstSelectedOption = mul.getFirstSelectedOption();
					
					System.out.println(firstSelectedOption.getText());
					
					
					
					
					
					
					
					
					
					
					
			
		}
		
		
	}


