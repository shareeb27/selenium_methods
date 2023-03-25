package Selenium_1class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Projectt2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		 
			WebDriver d = new ChromeDriver();
			
			d.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

			Actions a = new Actions(d);

			d.get("https://adactinhotelapp.com/");

			d.manage().window().maximize();

			/*
			 * WebElement new_register =
			 * d.findElement(By.xpath("//a[text()='New User Register Here']"));
			 * new_register.click();
			 * 
			 * System.out.println("Done..");
			 * 
			 * WebElement username = d.findElement(By.xpath("//input[@name=\"username\"]"));
			 * username.sendKeys("shareeb23");
			 * 
			 * System.out.println("username passed..");
			 * 
			 * WebElement pswrd =
			 * d.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
			 * pswrd.sendKeys("shareeb123");
			 * 
			 * System.out.println("passwrd sent..");
			 * 
			 * WebElement confirm_pswrd =
			 * d.findElement(By.xpath("//input[@name=\"re_password\"]"));
			 * confirm_pswrd.sendKeys("shareeb123");
			 * 
			 * System.out.println("confirmed..");
			 * 
			 * WebElement name = d.findElement(By.xpath("//input[@name=\"full_name\"]"));
			 * name.sendKeys("Md Shareeb");
			 * 
			 * System.out.println("name Done...");
			 * 
			 * WebElement add_email =
			 * d.findElement(By.xpath("//input[@name=\"email_add\"]"));
			 * add_email.sendKeys("shareebmd@gmail.com");
			 * 
			 * System.out.println("gmail added");
			 * 
			 * WebElement captcha = d.findElement(By.xpath("//input[@name=\"captcha\"]"));
			 * Scanner s = new Scanner(System.in); String word = s.next();
			 * captcha.sendKeys(word);
			 * 
			 * System.out.println("captcha verified successfully");
			 * 
			 * 
			 * WebElement tick = d.findElement(By.xpath("//input[@type=\"checkbox\"]"));
			 * tick.click();
			 * 
			 * System.out.println("ticked..");
			 * 
			 * WebElement register = d.findElement(By.xpath("//input[@name=\"Submit\"]"));
			 * register.click();
			 * 
			 * System.out.println("REGISTERED SUCCESSFULLY");
			 */

	//LOGIN PROCESS 

			WebElement username2 = d.findElement(By.xpath("//input[@type=\"text\"]"));
			username2.sendKeys("shareeb27");

			System.out.println("name sent..");

			WebElement paswrd = d.findElement(By.xpath("//input[@type=\"password\"]"));
			paswrd.sendKeys("shareeb123");

			System.out.println("pswrd sent..");

			WebElement login = d.findElement(By.xpath("//input[@name=\"login\"]"));
			login.click();

			System.out.println("SUCCESSFULLLY LOGIN");

			Thread.sleep(3000);
	//SEARCH HOTEL 

			// LOCATION

			WebElement single = d.findElement(By.xpath("//select[@name=\"location\"]"));
			Select s = new Select(single);
			s.selectByVisibleText("New York");

			System.out.println("location seleted...");

			// HOTEL

			WebElement single1 = d.findElement(By.xpath("//select[@name=\"hotels\"]"));
			Select s1 = new Select(single1);
			s1.selectByValue("Hotel Sunshine");

			System.out.println("hotel selected");

			// ROOM

			WebElement single2 = d.findElement(By.xpath("//select[@name=\"room_type\"]"));
			Select s2 = new Select(single2);
			s2.selectByVisibleText("Deluxe");

			System.out.println("Delux selected");

			// NUMBER OF ROOMS

			WebElement single3 = d.findElement(By.xpath("//select[@name=\"room_nos\"]"));
			Select s3 = new Select(single3);
			s3.selectByIndex(2);

			System.out.println("2 Rooms");

			// CHECK IN AND CHECK OUT

			WebElement check_in = d.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
			check_in.sendKeys("29/01/2023");

			System.out.println("check-In Done..");

			WebElement check_out = d.findElement(By.xpath("(//input[@name=\"datepick_out\"])"));
			check_out.sendKeys("30/01/2023");

			System.out.println("check-Out Done..");

			// PERSON PER ROOM

			WebElement single4 = d.findElement(By.xpath("//select[@name=\"adult_room\"]"));
			Select s4 = new Select(single4);
			s4.selectByValue("4");

			System.out.println("Done...");

			WebElement children = d.findElement(By.xpath("(//select[@id=\"child_room\"])"));
			Select child = new Select(children);
			child.selectByValue("2");

			System.out.println("HOTEL PROCESS DONE...");

			WebElement search = d.findElement(By.xpath("//input[@name=\"Submit\"]"));
			search.click();

			System.out.println("Done..");

	//SELECT HOTEL		

			WebElement click = d.findElement(By.xpath("//input[@type=\"radio\"]"));
			click.click();

	//BOOK A HOTEL 

			WebElement cntinue = d.findElement(By.xpath("//input[@type=\"submit\"]"));
			cntinue.click();

			WebElement first_name = d.findElement(By.xpath("//input[@name=\"first_name\"]"));
			first_name.sendKeys("MD");

//			Thread.sleep(2000);
			WebElement last_name = d.findElement(By.xpath("//input[@name=\"last_name\"]"));
			last_name.sendKeys("shareeb");

			WebElement address = d.findElement(By.xpath("//textarea[@class=\"txtarea\"]"));
			address.sendKeys("no,15 Muhammedpura opp st");

			System.out.println("BOOK HOTEL DONE");

			// CREDIT CARD PROCESS

			WebElement credit_card = d.findElement(By.xpath("//input[@name=\"cc_num\"]"));
			credit_card.sendKeys("12234567890123456");

			WebElement card_type = d.findElement(By.xpath("//select[@name=\"cc_type\"]"));
			Select s5 = new Select(card_type);
			s5.selectByValue("MAST");

			WebElement expiry_month = d.findElement(By.xpath("//select[@name=\"cc_exp_month\"]"));
			Select s6 = new Select(expiry_month);
			s6.selectByVisibleText("April");

			WebElement expiry_year = d.findElement(By.xpath("//select[@name=\"cc_exp_year\"]"));
			Select s7 = new Select(expiry_year);
			s7.selectByVisibleText("2021");

			System.out.println("CARD PROCESS DONE...");

			// CVV AND BOOK NOW PROCESS

			WebElement cvv = d.findElement(By.xpath("//input[@name=\"cc_cvv\"]"));
			cvv.sendKeys("124");

			WebElement book_now = d.findElement(By.xpath("//input[@type=\"button\"]"));
			book_now.click();

			WebElement itinerary = d.findElement(By.xpath("//input[@name=\"my_itinerary\"]"));
			itinerary.click();
			
			
			
			
             TakesScreenshot ts = (TakesScreenshot) d ;
	     	 
	     	 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	     	 
	     	 File dest = new File("C:\\Selenium_1\\screenshots\\adactinhotelapp.png");
	     	 
	     	 FileUtils.copyFile(screenshotAs,dest);
	     	 
	     	 System.out.println("captured");
            Thread.sleep(5000);
			WebElement search_id = d.findElement(By.xpath("//input[@name=\"order_id_text\"]"));
			search_id.sendKeys("KL38TY7ZNJ");

			
//			Thread.sleep(3000);

			WebElement Go = d.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
			Go.click();

//			Thread.sleep(3000);

			WebElement checkbox = d.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
			checkbox.click();
			
			WebElement cancel_booking = d.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
			cancel_booking.click();

			d.switchTo().alert().accept();

//			Thread.sleep(3000);

			WebElement logout = d.findElement(By.id("logout"));
			logout.click();
			
 // SCREENSHOT METHOD  
	     	 
	        TakesScreenshot ts1 = (TakesScreenshot) d ;
	     	 
	     	 File screenshotAs1 = ts1.getScreenshotAs(OutputType.FILE);
	     	 
	     	 File dest1 = new File("C:\\Selenium_1\\screenshots\\adactinhotelapp.png");
	     	 
	     	 FileUtils.copyFile(screenshotAs1,dest1);
	     	 
	     	 System.out.println("captured");
	     	 

			System.out.println("P R O J E C T  D O N E ...");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
