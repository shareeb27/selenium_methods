package Selenium_1class;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Driver_1{

		public static void main(String[] args) throws IOException {
		
				
					       
			
					 System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\driver2\\chromedriver.exe");
					 
					 WebDriver driver = new ChromeDriver();
					 
					 driver.navigate().to("https://www.amazon.in/s/?_encoding=UTF8&bbn=1350381031&rh=n%3A1350380031%2Cn%3A1378445031&dc=&qid=1653551597&rnid=1350381031&ref=lp_1350381031_nr_n_22&pf_rd_r=4M42R6JZ41YGHDTNBBMJ&pf_rd_p=7e11f066-76f0-4040-b869-0b4cbc370ade&pd_rd_r=806cc54d-fb10-4b14-9947-7269974ea718&pd_rd_w=A6oNm&pd_rd_wg=KnFsM&ref_=pd_gw_unk");
					 
					                                   System.out.println("opening amazon");
					 
					 
								         
					 
					 
					 								System.out.println("inserting name");
					 								
					 			WebElement amazon = driver.findElement(By.xpath("//input[@type=\"text\"]"));
					 				amazon.sendKeys("redmi note 9 pro max");
					 		
					 				
					 								System.out.println("clicking on search");
					 				
					 			WebElement search = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
					 			    search.click();
					 			    
					 			    				System.out.println("done");
				 
				 
				 
				 
					 			    				 
											     	 TakesScreenshot ts = (TakesScreenshot) driver ;
											     	 
											     	 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
											     	 
											     	 File dest = new File("C:\\Selenium_1\\screenshots\\amazonUrl.png");
											     	 
											     	 FileUtils.copyFile(screenshotAs,dest);
											     	 
											     	 System.out.println("captured");
											     	 
					        

				 
				 
					
					
					
					
					
								
								
								
								
		

		}

		

		

		
		
	
	
	
	
}
