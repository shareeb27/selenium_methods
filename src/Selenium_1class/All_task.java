package Selenium_1class;

import java.awt.Desktop.Action;
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
import org.openqa.selenium.interactions.ClickAndHoldAction;

public class All_task{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_1\\Driver\\chromedriver.exe");
		
	    WebDriver d = new ChromeDriver();
	
	
	/* d.get("https://www.facebook.com/");
	 
	 String title = d.getTitle();
	  System.out.println(title);
	 
	  String currentUrl = d.getCurrentUrl();
	  System.out.println(currentUrl); 
	
      System.out.println("DONE");
      
        
      
        		WebElement email = d.findElement(By.name("email"));
        				email.sendKeys("8610765217");
		       
        				System.out.println("inserting number");
		       
		       
        		WebElement password = d.findElement(By.name("pass"));
        				password.sendKeys("*******");
		       
        				System.out.println("inserting password");
		       
        		WebElement log = d.findElement(By.name("login"));
        				log.click();
		             
        				System.out.println("successfully logged in ");*/
		     
		             
		             //   d.quit();
        				
 /*  	d.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
 
		
							String title = d.getTitle();
							System.out.println(title + "opening");

							String currentUrl = d.getCurrentUrl();
							System.out.println(currentUrl+"opened"); */
	 
				
		           /*     d.navigate().refresh();
		                    System.out.println("refreshed successfully");*/
		
						     /*  System.out.println("inserting first name");

		               // X - PATH 
	     WebElement name = d.findElement(By.xpath("//input[@type=\"text\"]"));
		       name.sendKeys("Mohammed");
		       
		              // X- PATH WITH INDEX          
		                       System.out.println("inserting second name");
       
	     WebElement name1 = d.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		                 name1.sendKeys("shareeb");
		                 
   				     // X - PATH WITH TEXT 
		                 
		                 
		  WebElement current_email = d.findElement(By.xpath("//span[text () = 'Use my current email address instead']"));               
		  					 current_email.click();
		  					 
		  			// X - PATH WITH CONTAINS 
		  					 
		 WebElement email = d.findElement(By.xpath("//input[@type=\"password\"]")); */
		           
		                 
		                 
		               //  System.out.println("DONE");
		                 
	
						
	
               /*    d.navigate().to("https://www.flipkart.com/");
                                       	
        WebElement travel = d.findElement(By.xpath("//div[text () = 'Travel']"));
               
               String text = travel.getText();
                    System.out.println("TEXT is  :"+ text);
                    
                    
               String tagName = travel.getTagName();
                    System.out.println("TAG NAME : "+tagName);
                    
               
               boolean displayed = travel.isDisplayed();
                  	System.out.println("is Displayed :"+displayed);
                    	
                    
               boolean enabled = travel.isEnabled();
                  	System.out.println("IS ENABLED : "+enabled);
                  	
                  	
               boolean selected = travel.isSelected();
                  	System.out.println("IS SELECTED : "+selected);
                  	
                  	
                  	System.out.println("TRAVEL IS CHECKED");
                  	
       //           	
                  	
        WebElement top_offers = d.findElement(By.xpath("//div[text () = 'Top Offers']"));
        			
        		String tagName2 = top_offers.getTagName();
        		System.out.println("TAG NAME IS :"+tagName2);
        		
        		String text2 = top_offers.getText();
        		System.out.println("TEXT IS : "+text2);
        		   		
        		boolean displayed2 = top_offers.isDisplayed();
        		System.out.println("IS DISPLAYED : "+displayed2);
        		
        		boolean enabled2 = top_offers.isEnabled();
        		System.out.println("IS ENABLED : "+enabled2);
        		
        		boolean selected2 = top_offers.isSelected();
        		System.out.println("IS SELECTED : "+selected2);
        		
        		
        		  System.out.println("TOP_OFFERS IS CHECKED");
        		  
     //   		  
        		
      WebElement home = d.findElement(By.xpath("//div[text () = 'Home']"));
      			
          		String tagName3 = home.getTagName();
          		System.out.println("TAG NAME IS :"+tagName3);
          		
          		String text3 = home.getText();
          		System.out.println("TEXT IS : "+text3);
          		   		
          		boolean displayed3 = home.isDisplayed();
          		System.out.println("IS DISPLAYED : "+displayed3);
          		
          		boolean enabled3 = home.isEnabled();
          		System.out.println("IS ENABLED : "+enabled3);
          		
          		boolean selected3 = home.isSelected();
          		System.out.println("IS SELECTED : "+selected3);
          		
          		
          		  System.out.println("HOME IS CHECKED");
          		   
      //
          		  
          WebElement appliance = d.findElement(By.xpath("//div[text () = 'Appliances']"));
          
           
               String text4 = appliance.getText();
               System.out.println("TEXT IS :"+text4);
               
               String tagName4 = appliance.getTagName();
               System.out.println("TAG NAME IS :"+tagName4);
               
               boolean displayed4 = appliance.isDisplayed();
               System.out.println("IS SELECTED :"+displayed4);
               
               boolean enabled4 = appliance.isEnabled();
               System.out.println("IS ENABLED : "+enabled4);
               
               boolean selected4 = appliance.isSelected();
               System.out.println("IS SELECTED :"+selected4);
               
               
                  System.out.println("APPLIANCE IS CHECKED");
                  
         //         
                  
                     System.out.println(" FLIPKART OPENED ");
                               
                  TakesScreenshot ts = (TakesScreenshot) d ;
			     	 
			     	 File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			     	 
			     	 File dest = new File("C:\\Selenium_1\\screenshots\\flipkartUrl.png");
			     	 
			     	 FileUtils.copyFile(screenshotAs,dest);
			     	 
			     	 System.out.println("captured");*/
                   
                   
              
	      /* d.get("https://demo.automationtesting.in/Alerts.html");
	       
	        WebElement simple = d.findElement(By.xpath("//a[text() = 'Alert with OK ']"));
	         simple.click();
	       
	       WebElement simple_button = d.findElement(By.xpath("//div[@id=\"OKTab\" ]           "));
	        simple_button.click();
	        
	        

		
	        
	              Thread.sleep(5000);
	              
	 	     	 d.switchTo().alert().accept();

	     	 
	     	 
	     	  WebElement confirm = d.findElement(By.xpath("//a[text () ='Alert with OK & Cancel ']           "));
		         confirm.click();
		       
		      WebElement confirm_button = d.findElement(By.xpath("//div[@id='CancelTab']           "));
		         confirm_button.click();
		          
		           Thread.sleep(5000);

		         
		         d.switchTo().alert().dismiss();
		         
		         
		         
		        WebElement textBox = d.findElement(By.xpath("//a[text () =\"Alert with Textbox \"]           "));
		         textBox.click();
		        
		         WebElement textBox_button = d.findElement(By.xpath("//div[@id=\"Textbox\"]           "));
		         textBox_button.click();
		         
		         
		         d.switchTo().alert().sendKeys("shareeb");
		            
		           Thread.sleep(5000);

		           
		            d.switchTo().alert().accept();
		            
		            System.out.println("DONE"); */
		         
		         
		         
	   /* d.get("https://www.flipkart.com/");
	    
	    
	    WebElement button = d.findElement(By.xpath("//button[text()='✕']"));
		button.click();
		
		System.out.println("done");
		
		 
	    WebElement mobiles  = d.findElement(By.xpath("//div[text()='Mobiles']"));
		     
	     Actions as = new Actions(d);	 
	     	 
	     	 as.moveToElement(mobiles).build().perform();
	     	 
	     	 as.click().perform();
	        
	     	 System.out.println("MOVING DONE");
	     	 
	 WebElement electronics = d.findElement(By.xpath("//span[text()='Electronics']"));
	        
          as.moveToElement(electronics).build().perform();
          
          as.contextClick(electronics).perform();*/
	    
	    d.get("https://www.bigbasket.com/");
          
	    
	    Actions a = new Actions(d);
	    
                  WebElement search_box = d.findElement(By.xpath("//input[@qa=\"searchBar\"]"));

                  a.moveToElement(search_box).build().perform();
                  
                  a.clickAndHold(search_box).perform();
                  
                  search_box.sendKeys("rice");

                  d.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);

                  WebElement add = d.findElement(By.xpath("(//span[text()='ADD'])[1]"));
          
                  a.moveToElement(add).build().perform();
                  
                  a.click(add).perform();
                  
          
          
          
          //rough use for nykaaa project
                //CONFIRMATION PROCESS 
      			
//      			WebElement verify = d.findElement(By.xpath("//button[text()='verify']"));
//      			verify.click();
//      			
//      			WebElement fullname = d.findElement(By.xpath("//input[@type=\"text\"]"));
//      			fullname.sendKeys("shareeb");
//      			
//      			WebElement gmail = d.findElement(By.xpath("(//input[@class=\"input-element\"])[2]"));
//      			gmail.sendKeys("shareebmd@gmail.com");
//      			
//      			WebElement save = d.findElement(By.xpath("//button[text()='Save']"));
//      			save.click();
//      			 System.out.println("DONE...");
          
          		  
          		  
          		  
          		  
          		  
          		  
          		   		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
        		
         
                  	
                  	
                  				
                  				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	}

	

}
